package com.ifruitcommerce.ifruit.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_orderitem")
public class OrderItem implements Serializable{
    private static final long serialVersionUID = -78412369548928L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Double price;

    public OrderItem() { }

    public OrderItem(Long id, Integer quantity, Double price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
