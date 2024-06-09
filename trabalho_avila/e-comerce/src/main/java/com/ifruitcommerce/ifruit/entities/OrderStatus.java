package com.ifruitcommerce.ifruit.entities;

public enum OrderStatus {
    WAITING_PAYMENT("Esperando pagamento"),
    PAID("Pago"),
    SHIPPED("Enviado"),
    DELIVERED("Entregue"),
    CANCELED("Cancelado");

    private String title;

    OrderStatus(String title){
        this.title = title;
    }
}
