package com.ifruitcommerce.ifruit.resources;

import com.ifruitcommerce.ifruit.entities.OrderItem;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orderitems")
public class OrderItemResource {
    @GetMapping
    public ResponseEntity findAll(){
        OrderItem o = new OrderItem(1L,2, 10.0);
        return ResponseEntity.ok().body(o);
    }
}
