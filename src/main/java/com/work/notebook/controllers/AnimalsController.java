package com.work.notebook.controllers;

import com.work.notebook.entities.Animal;
import com.work.notebook.services.AnimalsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/animals")
public class AnimalsController {

    private AnimalsService animalsService;

    @Autowired
//    @Qualifier(value = "animalsService")
    public void setAnimalService(AnimalsService animalsService) {
        this.animalsService = animalsService;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String listAnimals(Model model){
        model.addAttribute("animal", new Animal());
        model.addAttribute("listAnimals", this.animalsService.listAnimals());

        return "animals";
    }

    @RequestMapping(value = "/animalData/{animal_id}")
    public String animalData(@PathVariable("animal_id") int animal_id, Model model){
        model.addAttribute("animal", this.animalsService.getAnimalById(animal_id));

        return "animalData";
    }
}
