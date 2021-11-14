package com.work.notebook.dao.impl;

import com.work.notebook.dao.FoodRatesDAO;
import com.work.notebook.entities.FoodRate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;

@Repository
public class FoodRatesDAOImpl implements FoodRatesDAO {

    private static final Logger logger = LoggerFactory.getLogger(AnimalsDAOImpl.class);

    private EntityManagerFactory entityManagerFactory;

    @Autowired
    public FoodRatesDAOImpl (EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public FoodRate getRationById(int id) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        FoodRate foodRate = session.get(FoodRate.class, id);

        logger.info("Food rates successfully loaded. Food rate id: " + id);

        transaction.commit();
        session.close();

        return foodRate;
    }
}
