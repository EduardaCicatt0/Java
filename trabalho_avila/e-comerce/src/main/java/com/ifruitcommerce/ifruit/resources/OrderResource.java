package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.Order;
import com.ifruitcommerce.ifruit.entities.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    @GetMapping
    public ResponseEntity findAll(){
        Order or = new Order();
        return ResponseEntity.ok().body(or);
    }
}
