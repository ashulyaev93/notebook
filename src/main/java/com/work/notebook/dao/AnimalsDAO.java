package com.work.notebook.dao;

import com.work.notebook.dto.AnimalDTO;
import com.work.notebook.entities.Animal;

import java.util.List;

public interface AnimalsDAO {

    public List<Animal> listAnimals();
    public Animal getAnimalById(int animalId);
    public void deleteAnimal(int animalId);
    public Animal incomeAnimal(AnimalDTO animalDTO);
}
