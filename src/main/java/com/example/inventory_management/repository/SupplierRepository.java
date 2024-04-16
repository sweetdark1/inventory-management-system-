package com.example.inventory_management.repository;
import com.example.inventory_management.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface SupplierRepository extends JpaRepository<SupplierEntity, Long>{
}
