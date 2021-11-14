package com.work.notebook.facade;

import com.work.notebook.dto.AnimalDTO;
import com.work.notebook.entities.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalFacade {

    public AnimalDTO animalToAnimalsDTO(Animal animals){
        AnimalDTO animalDTO = new AnimalDTO();
        animalDTO.setAnimalId(animals.getAnimalId());
        animalDTO.setKindAnimals(animals.getKindAnimals());
        animalDTO.setName(animals.getName());
        animalDTO.setPredatorSign(animals.getPredatorSign());

        return animalDTO;
    }
}
