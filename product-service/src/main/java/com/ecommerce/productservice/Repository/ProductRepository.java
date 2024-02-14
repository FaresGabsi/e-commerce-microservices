package com.ecommerce.productservice.Repository;

import com.ecommerce.productservice.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
