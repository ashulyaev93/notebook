package com.work.notebook.repositories;

import com.work.notebook.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Long> {

    List<Product> listProducts();
    Product getProductById(int productId);
}
