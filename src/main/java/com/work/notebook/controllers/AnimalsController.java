package com.work.notebook.controllers;

import com.work.notebook.entities.Animal;
import com.work.notebook.services.AnimalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/animals")
public class AnimalsController {

    private AnimalsService animalsService;

    @Autowired
    public AnimalsController(AnimalsService animalsService) {
        this.animalsService = animalsService;
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
}
