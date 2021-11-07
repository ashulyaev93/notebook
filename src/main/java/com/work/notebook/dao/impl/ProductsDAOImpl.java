package com.work.notebook.dao.impl;

import com.work.notebook.dao.ProductsDAO;
import com.work.notebook.entities.Animal;
import com.work.notebook.entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductsDAOImpl implements ProductsDAO {

    private static final Logger logger = LoggerFactory.getLogger(ProductsDAOImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Product> listProducts() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Product> productsList = session.createQuery("from Product").list();

        for(Product products : productsList){
            logger.info("Products list: " + products);
        }

        return productsList;
    }

    @Override
    public Product getProductById(int productId) {
        Session session =this.sessionFactory.getCurrentSession();
        Product products = session.load(Product.class, new Integer(productId));
        logger.info("Products successfully loaded. Products details: " + products);

        return products;
    }
}
