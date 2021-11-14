package com.work.notebook.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.work.notebook.entities.FoodRate;
import com.work.notebook.entities.Product;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class AnimalFoodRateResponse  {
    private int animalId;
    private String productName;
    private int foodRateOnSevenDaysForAnimal;
    private int totalProduct;
    private Integer needProduct;
    private String unit;

   public AnimalFoodRateResponse(FoodRate foodRate,
                                 Product product){
       this.animalId = foodRate.getAnimalId();
       this.productName = product.getName();
       this.foodRateOnSevenDaysForAnimal = Math.toIntExact(foodRate.getRate() * 7);
       this.totalProduct = Math.toIntExact(product.getQuantity());
       this.needProduct = Math.toIntExact(product.getQuantity() - foodRate.getRate());
       this.unit = product.getUnit();

       if(needProduct > 0){
           needProduct = null;
       } else {
           needProduct = needProduct * (-1);
       }
   }
}
