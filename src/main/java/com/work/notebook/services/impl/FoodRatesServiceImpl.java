package com.work.notebook.services.impl;

import com.work.notebook.dao.FoodRatesDAO;
import com.work.notebook.entities.FoodRate;
import com.work.notebook.services.FoodRatesService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FoodRatesServiceImpl implements FoodRatesService {

    private FoodRatesDAO foodRatesDAO;

    public void seFoodRatesDAO(FoodRatesDAO foodRatesDAO) {
        this.foodRatesDAO = foodRatesDAO;
    }

    @Override
    @Transactional
    public FoodRate getSevenDayRationForAnimal(int id) {
        return null;
    }
}
