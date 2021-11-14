package com.work.notebook.controllers;

import com.work.notebook.entities.Animal;
import com.work.notebook.entities.FoodRate;
import com.work.notebook.entities.Product;
import com.work.notebook.response.AnimalFoodRateResponse;
import com.work.notebook.services.AnimalsService;
import com.work.notebook.services.FoodRatesService;
import com.work.notebook.services.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/zoo/foodRates")
public class FoodRatesController {

    private FoodRatesService foodRatesService;
    private AnimalsService animalsService;
    private ProductsService productsService;

    @Autowired
    public FoodRatesController(FoodRatesService foodRatesService,
                               AnimalsService animalsService,
                               ProductsService productsService) {
        this.foodRatesService = foodRatesService;
        this.animalsService = animalsService;
        this.productsService = productsService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<FoodRate>> getRationById(@PathVariable("id") int id){
        FoodRate foodRate = foodRatesService.getRationById(id);

        return new ResponseEntity(foodRate,HttpStatus.OK);
    }

    @GetMapping("/animal/{animal_id}")
    public ResponseEntity<List<FoodRate>> getFoodRateSevenDayForAnimalById(@PathVariable("animal_id") int animalId){
        Animal animal = animalsService.getAnimalById(animalId);

        List<FoodRate> foodRates = animal.getFoodRates();

        List<AnimalFoodRateResponse> animalFoodRateResponseList = new ArrayList<>();
        for(FoodRate foodRate : foodRates){
            Product product = productsService.getProductById(foodRate.getProductId());
            animalFoodRateResponseList.add(new AnimalFoodRateResponse(foodRate,product));
        }

        return new ResponseEntity(animalFoodRateResponseList,HttpStatus.OK);
    }
}
