package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.SupplierDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SupplierService {
    SupplierDTO getSupplier(Long id);
    List<SupplierDTO> getAllSuppliers();
    SupplierDTO createSupplier(SupplierDTO supplierDTO);
    SupplierDTO updateSupplier(long id,SupplierDTO supplierDTO);
    void deleteSupplier(long id);

}
