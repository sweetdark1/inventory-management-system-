package com.example.inventory_management.controller;
import com.example.inventory_management.DTO.SupplierDTO;
import com.example.inventory_management.Services.SupplierService;
import com.example.inventory_management.Services.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.function.Supplier;

@RequestMapping("/suppliers")
@RestController
public class SupplierController {
    @Autowired
    SupplierService supplierService = new SupplierServiceImpl();

    @GetMapping("{ID}")
    public SupplierDTO getSupplier(@PathVariable long ID) {

         return supplierService.getSupplier(ID);

    }
    @GetMapping("")
    public List<SupplierDTO> getAllSupplier() {

        return supplierService.getAllSuppliers();

    }

    @PostMapping
    public SupplierDTO createSupplier(@RequestBody SupplierDTO supplier) {
       return supplierService.createSupplier(supplier);
    }

    @PatchMapping("{ID}")
    public void updateSupplier(@PathVariable long ID ,@RequestBody SupplierDTO supplier) {
        supplierService.updateSupplier(ID,supplier);

    }

    @DeleteMapping("{ID}")
    public void delete(@PathVariable int ID) {
        supplierService.deleteSupplier(ID);
    }
}
