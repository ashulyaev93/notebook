package com.work.notebook.services;

import com.work.notebook.entities.FoodRate;
import org.springframework.stereotype.Service;

@Service
public interface FoodRatesService {

    FoodRate getRationById(int id);
}
