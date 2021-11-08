package com.work.notebook.dao.impl;

import com.work.notebook.dao.ProductsDAO;
import com.work.notebook.entities.Product;
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
public class ProductsDAOImpl implements ProductsDAO {

    private static final Logger logger = LoggerFactory.getLogger(ProductsDAOImpl.class);

    private EntityManagerFactory entityManagerFactory;

    @Autowired
    public ProductsDAOImpl (EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public List<Product> listProducts() {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        List<Product> productsList = session.createQuery("from Product").list();

        for(Product products : productsList){
            logger.info("Products list: " + products);
        }

        transaction.commit();
        session.close();

        return productsList;
    }

    @Override
    public Product getProductById(int productId) {
        Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();

        Product product = session.get(Product.class,productId);
        logger.info("Products successfully loaded. Products details: " + product);

        return product;
    }
}
