package com.work.notebook.repositories;

import com.work.notebook.entities.FoodRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRatesRepository extends JpaRepository<FoodRate,Integer> {

    FoodRate getSevenDayRationForAnimal(int animalId);
}
