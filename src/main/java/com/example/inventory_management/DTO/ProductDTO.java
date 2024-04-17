package com.example.inventory_management.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int id;
    private String productName;
    private int productPrice;
    private long supplier_id;
}

