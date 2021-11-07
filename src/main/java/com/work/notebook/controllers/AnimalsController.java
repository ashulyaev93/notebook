package com.work.notebook.controllers;

import com.work.notebook.dto.AnimalsDTO;
import com.work.notebook.entities.Animal;
import com.work.notebook.facade.AnimalsFacade;
import com.work.notebook.services.AnimalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/animals")
public class AnimalsController {

    private AnimalsService animalsService;
    private AnimalsFacade animalsFacade;

    @Autowired
    public AnimalsController(AnimalsService animalsService,
                             AnimalsFacade animalsFacade){
        this.animalsService = animalsService;
        this.animalsFacade = animalsFacade;
    }

    @GetMapping("/{animal_id}")
    public ResponseEntity<List<AnimalsDTO>> getAnimalById(@PathVariable("animal_id") int animalId){
        List<AnimalsDTO> animalsDTOList = animalsService.getAnimalById(animalId)
                .stream()
                .map(animalsFacade::animalsToAnimalsDTO)
                .collect(Collectors.toList());

        return new ResponseEntity<>(animalsDTOList, HttpStatus.OK);
    }
}
