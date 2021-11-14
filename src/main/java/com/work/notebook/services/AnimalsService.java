package com.work.notebook.services;

import com.work.notebook.entities.Animal;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnimalsService {

    public List<Animal> listAnimals();
    public Animal getAnimalById(int animalId);
    public void deleteAnimal(int animalId);
}
