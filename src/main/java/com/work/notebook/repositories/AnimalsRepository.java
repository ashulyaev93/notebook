package com.work.notebook.repositories;

import com.work.notebook.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalsRepository extends JpaRepository<Animal,Long> {

    List<Animal> listAnimals();
    List<Animal> getAnimalById(int animalId);
}
