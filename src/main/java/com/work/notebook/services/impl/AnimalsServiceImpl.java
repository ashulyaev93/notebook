package com.work.notebook.services.impl;

import com.work.notebook.entities.Animal;
import com.work.notebook.repositories.AnimalsRepository;
import com.work.notebook.services.AnimalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    private AnimalsRepository animalsRepository;
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    public AnimalsServiceImpl(AnimalsRepository animalsRepository,
                           EntityManagerFactory entityManagerFactory){
        this.animalsRepository = animalsRepository;
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    @Transactional
    public List<Animal> listAnimals() {
        return this.animalsRepository.listAnimals();
    }

    @Override
    @Transactional
    public List<Animal> getAnimalById(int animalId) {
        return this.animalsRepository.getAnimalById(animalId);
    }
}
