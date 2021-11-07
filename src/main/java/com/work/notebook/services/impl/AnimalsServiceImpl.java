package com.work.notebook.services.impl;

import com.work.notebook.dao.AnimalsDAO;
import com.work.notebook.entities.Animal;
import com.work.notebook.services.AnimalsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnimalsServiceImpl implements AnimalsService {

    private AnimalsDAO animalsDAO;

    public void setAnimalsDAO(AnimalsDAO animalsDAO) {
        this.animalsDAO = animalsDAO;
    }

    @Override
    @Transactional
    public List<Animal> listAnimals() {
        return this.animalsDAO.listAnimals();
    }

    @Override
    @Transactional
    public Animal getAnimalById(int animalId) {
        return this.animalsDAO.getAnimalById(animalId);
    }
}
