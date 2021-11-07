package com.work.notebook.services;

import com.work.notebook.repositories.AnimalsRepository;
import com.work.notebook.entities.Animal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public interface AnimalsService {

//    public static final Logger LOG = LoggerFactory.getLogger(ProductsService.class);
//
//    private AnimalsRepository animalsRepository;
//    private EntityManagerFactory entityManagerFactory;
//
//    @Autowired
//    public AnimalsService(AnimalsRepository animalsRepository,
//                           EntityManagerFactory entityManagerFactory){
//        this.animalsRepository = animalsRepository;
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public List<Animal> listAnimals() {
//        return this.animalsRepository.listAnimals();
//    }
//
//    public List<Animal> getAnimalById(Long animalId) {
//        return this.animalsRepository.getAnimalById(animalId);
//    }


    List<Animal> listAnimals();
    List<Animal> getAnimalById(int animalId);
}
