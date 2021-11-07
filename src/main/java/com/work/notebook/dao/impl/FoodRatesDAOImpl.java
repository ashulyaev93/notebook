package com.work.notebook.dao.impl;

import com.work.notebook.dao.FoodRatesDAO;
import com.work.notebook.entities.FoodRate;
import org.springframework.stereotype.Repository;

@Repository
public class FoodRatesDAOImpl implements FoodRatesDAO {

    @Override
    public FoodRate getSevenDayRationForAnimal(int animalId) {
        return null;
    }
}
