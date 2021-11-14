package com.work.notebook.dao.impl;

import com.work.notebook.dao.AnimalsDAO;
import com.work.notebook.entities.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Repository
public class AnimalsDAOImpl implements AnimalsDAO {

    private static final Logger logger = LoggerFactory.getLogger(AnimalsDAOImpl.class);

    private EntityManagerFactory entityManagerFactory;

    @Autowired
    public AnimalsDAOImpl (EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public List<Animal> listAnimals() {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        List<Animal> animalsList = session.createQuery("from Animal").list();

        for(Animal animals : animalsList){
            logger.info("Animals list: " + animals);
        }

        transaction.commit();
        session.close();

        return animalsList;
    }

    @Override
    public Animal getAnimalById(int animalId) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        Animal animal = session.get(Animal.class,animalId);

        logger.info("Animals successfully loaded. Animals details: " + animal);

        transaction.commit();
        session.close();

        return animal;
    }

    @Override
    public void deleteAnimal(int animalId) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        Animal animal = session.find(Animal.class,animalId);
        session.remove(animal);

        logger.info("Animal successfully deleted. Animal details: " + animal);

        transaction.commit();
        session.close();
    }
}
