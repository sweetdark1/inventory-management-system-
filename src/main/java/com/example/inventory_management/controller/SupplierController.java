package com.example.inventory_management.controller;
import com.example.inventory_management.DTO.SupplierDTO;
import com.example.inventory_management.Services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.function.Supplier;

@RequestMapping("/supplier")
@RestController
public class SupplierController {
    @Autowired
    private SupplierService service;

    @GetMapping("{ID}")
    public SupplierDTO getSupplier(@PathVariable int ID) {
        //return serivce.getSupplier(ID);
        return new SupplierDTO();
    }

    @PostMapping
    public void createSupplier(@RequestBody Supplier supplier) {
    }

    @PutMapping
    public void updateSupplier(@RequestBody Supplier supplier) {

    }

    @DeleteMapping
    public void delete(@RequestParam("supplierId") int supplierId) {

    }
}
