package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
    @GetMapping
    public ResponseEntity findAll(){
        Product pr = new Product(1L, "Bala", "Uma bala doce", 1.00, "imagem");
        return ResponseEntity.ok().body(pr);
    }
}
