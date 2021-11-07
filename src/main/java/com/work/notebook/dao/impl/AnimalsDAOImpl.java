package com.work.notebook.dao.impl;

import com.work.notebook.dao.AnimalsDAO;
import com.work.notebook.entities.Animal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalsDAOImpl implements AnimalsDAO {

    private static final Logger logger = LoggerFactory.getLogger(AnimalsDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Animal> listAnimals() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Animal> animalsList = session.createQuery("from Animal").list();

        for(Animal animals : animalsList){
            logger.info("Animals list: " + animals);
        }

        return animalsList;
    }

    @Override
    public Animal getAnimalById(int animalId) {
        Session session =this.sessionFactory.getCurrentSession();
        Animal animals = session.load(Animal.class, new Integer(animalId));
        logger.info("Animals successfully loaded. Animals details: " + animals);

        return animals;
    }
}
