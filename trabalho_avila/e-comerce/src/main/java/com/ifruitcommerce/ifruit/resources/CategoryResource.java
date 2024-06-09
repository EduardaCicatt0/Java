package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResource {
    @GetMapping
    public ResponseEntity<Category> findAll(){
        Category c = new Category(1L, "Grãos");
        return ResponseEntity.ok().body(c);
    }
}
