package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    public List<Product> findAllProduct(){
        return this.productRepo.findAll();
    }

    public Product newProduct(Product product){
        return this.productRepo.save(product);
    }
}
