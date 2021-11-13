package com.work.notebook.controllers;

import com.work.notebook.entities.Animal;
import com.work.notebook.entities.FoodRate;
import com.work.notebook.services.FoodRatesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
//import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/foodRates")
public class FoodRatesController {

    private FoodRatesService foodRatesService;

    @Autowired
    public FoodRatesController(FoodRatesService foodRatesService) {
        this.foodRatesService = foodRatesService;
    }

    @GetMapping("/{animal_id}")
    public ResponseEntity<List<FoodRate>> getRationForAnimalById(@PathVariable("animal_id") int animalId){
        FoodRate foodRate = foodRatesService.getRationForAnimalById(animalId);

        return new ResponseEntity(foodRate,HttpStatus.OK);
    }
}
