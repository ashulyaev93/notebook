package com.work.notebook.facade;

import com.work.notebook.dto.AnimalsDTO;
import com.work.notebook.entities.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalsFacade {

    public AnimalsDTO animalsToAnimalsDTO(Animal animals){
        AnimalsDTO animalsDTO = new AnimalsDTO();
        animalsDTO.setAnimalId(animals.getAnimalId());
        animalsDTO.setName(animals.getName());
        animalsDTO.setKindAnimals(animals.getKindAnimals());
        animalsDTO.setPredatorSign(animals.getPredatorSign());

        return animalsDTO;
    }
}
