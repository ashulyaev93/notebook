package com.work.notebook.services;

import com.work.notebook.entities.FoodRate;
import com.work.notebook.repositories.FoodRatesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;

@Service
public interface FoodRatesService {

//    public static final Logger LOG = LoggerFactory.getLogger(ProductsService.class);
//
//    private final FoodRatesRepository foodRatesRepository;
//    private final EntityManagerFactory entityManagerFactory;
//
//    @Autowired
//    public FoodRatesService(FoodRatesRepository foodRatesRepository,
//                            EntityManagerFactory entityManagerFactory){
//        this.foodRatesRepository = foodRatesRepository;
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public FoodRate getSevenDayRationForAnimal(Long animalId){
//        return this.foodRatesRepository.getSevenDayRationForAnimal(animalId);
//    }


    FoodRate getSevenDayRationForAnimal(Long animalId);
}
