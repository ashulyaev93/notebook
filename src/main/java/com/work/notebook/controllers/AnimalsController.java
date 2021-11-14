package com.work.notebook.controllers;

import com.work.notebook.dto.AnimalDTO;
import com.work.notebook.entities.Animal;
import com.work.notebook.exception.AnimalExistException;
import com.work.notebook.facade.AnimalFacade;
import com.work.notebook.response.MessageResponse;
import com.work.notebook.services.AnimalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/animals")
public class AnimalsController {

    private AnimalsService animalsService;
    private AnimalFacade animalFacade;

    @Autowired
    public AnimalsController(AnimalsService animalsService, AnimalFacade animalFacade) {
        this.animalsService = animalsService;
        this.animalFacade = animalFacade;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<List<Animal>> getAllAnimals(){
        List<Animal> animalList = animalsService.listAnimals();

        return new ResponseEntity<>(animalList, HttpStatus.OK);
    }

    @GetMapping("/{animal_id}")
    public ResponseEntity<List<Animal>> getAnimalById(@PathVariable("animal_id") int animalId){
        Animal animal = animalsService.getAnimalById(animalId);

        return new ResponseEntity(animal,HttpStatus.OK);
    }

    @GetMapping("/delete/{animal_id}")
    public ResponseEntity<MessageResponse> deleteAnimal(@PathVariable("animal_id") int animalId){
        animalsService.deleteAnimal(animalId);
        return new ResponseEntity<>(new MessageResponse("Animal with id =" + animalId + " deleted"), HttpStatus.OK);
    }

    @RequestMapping(value = "/income", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> addAnimal(@Validated @RequestBody AnimalDTO animalDTO) throws AnimalExistException {

        Animal animals = animalsService.incomeAnimal(animalDTO);
        AnimalDTO addAnimal = animalFacade.animalToAnimalsDTO(animals);

        return new ResponseEntity<>(addAnimal, HttpStatus.OK);
    }
}
