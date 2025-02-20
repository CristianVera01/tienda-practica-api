package com.tienda.controllers;

import com.tienda.models.Product;
import com.tienda.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

   @Autowired
   private ProductService productService;

    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getallProducts();

    }
    @PostMapping("/add")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable UUID id){
        return productService.getProductById(id);
    }

    @DeleteMapping("/delProductById/{id}")
    public String delProductById(@PathVariable UUID id){
        productService.delProduct(id);
        return "Producto eliminado";
    }
    @GetMapping("/ProductsByCategory/{id}")
    public List<Product> getProductsByCategory(@PathVariable Long id) {
        return productService.getProductsByCategory(id);
    }
}

