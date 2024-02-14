package com.ecommerce.productservice.Service;

import com.ecommerce.productservice.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Integer id);
    public Product saveProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(Integer id);
}
