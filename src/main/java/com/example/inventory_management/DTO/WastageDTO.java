package com.example.inventory_management.DTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WastageDTO {
    private long id;
    private String quantity;
    private String reason;
    private long product_id;
}
