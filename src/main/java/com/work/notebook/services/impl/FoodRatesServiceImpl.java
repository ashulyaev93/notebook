package com.work.notebook.services.impl;

import com.work.notebook.dao.FoodRatesDAO;
import com.work.notebook.entities.Animal;
import com.work.notebook.entities.FoodRate;
import com.work.notebook.services.FoodRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FoodRatesServiceImpl implements FoodRatesService {

    private FoodRatesDAO foodRatesDAO;

    @Autowired
    public FoodRatesServiceImpl(FoodRatesDAO foodRatesDAO){
        this.foodRatesDAO = foodRatesDAO;
    }

    @Override
    @Transactional
    public FoodRate getRationForAnimalById(int animalId) {
        return this.foodRatesDAO.getRationForAnimalById(animalId);
    }
}
