package com.ifruitcommerce.ifruit.services;

import com.ifruitcommerce.ifruit.entities.Product;
import com.ifruitcommerce.ifruit.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product getProductByName(String name){
        return productRepository.findProductByName(name);
    }
}
