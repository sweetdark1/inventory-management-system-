package com.example.inventory_management.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO implements Serializable {
    private long id;
    private String name;
    private String contactInfo;
}
