package com.example.inventory_management.DTO;


import com.example.inventory_management.entity.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int quantity;
    private String orderDate;
    private String deliveryDate;
    private long product_id;
}

