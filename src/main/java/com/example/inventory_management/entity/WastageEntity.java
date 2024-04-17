package com.example.inventory_management.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Wasted")
public class WastageEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String quantity;
    private String reason;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product_id;
}
