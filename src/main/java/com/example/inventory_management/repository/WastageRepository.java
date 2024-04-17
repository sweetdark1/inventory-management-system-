package com.example.inventory_management.repository;

import com.example.inventory_management.entity.WastageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WastageRepository extends JpaRepository<WastageEntity, Long> {
}
