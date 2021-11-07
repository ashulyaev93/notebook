package com.work.notebook.facade;

import com.work.notebook.dto.FoodRatesDTO;
import com.work.notebook.entities.FoodRate;
import org.springframework.stereotype.Component;

@Component
public class FoodRatesFacade {

    public FoodRatesDTO FoodRatesToFoodRatesDTO(FoodRate foodRates){
        FoodRatesDTO foodRatesDTO = new FoodRatesDTO();
        foodRatesDTO.setId(foodRates.getId());
        foodRatesDTO.setAnimal(foodRates.getAnimal());
        foodRatesDTO.setProduct(foodRates.getProduct());
        foodRatesDTO.setRate(foodRates.getRate());
        foodRatesDTO.setUnit(foodRates.getUnit());

        return foodRatesDTO;
    }
}
