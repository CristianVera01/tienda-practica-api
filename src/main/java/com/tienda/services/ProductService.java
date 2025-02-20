package com.tienda.services;

import com.tienda.models.Product;
import com.tienda.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getallProducts(){

        return productRepository.findAll();
    }

    public Product saveProduct(Product product){

        return productRepository.save(product);
    }
    public Product getProductById(UUID id){
       return productRepository.findById(id).orElse(null);
    }
    public void delProduct(UUID id){
        productRepository.deleteById(id);
    }
    public List<Product> getProductsByCategory(Long id) {
        return productRepository.findByCategoryId(id);
    }

}
