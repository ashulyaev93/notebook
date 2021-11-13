package com.work.notebook.dao;

import com.work.notebook.entities.Animal;
import com.work.notebook.entities.FoodRate;

public interface FoodRatesDAO {

    public FoodRate getRationForAnimalById(int animalId);

}
