package com.example.inventory_management.controller;

import com.example.inventory_management.DTO.WastageDTO;
import com.example.inventory_management.Services.WastageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/wastage")
@RestController
public class WastageController {

    @Autowired
    private WastageService wastageService;

    @GetMapping("{id}")
    public WastageDTO getWastage(@PathVariable long id) {
        return wastageService.getWastage(id);
    }

    @GetMapping("")
    public List<WastageDTO> getAllWastages() {
        return wastageService.getAllWastages();
    }

    @PostMapping
    public WastageDTO recordWastage(@RequestBody WastageDTO wastageDTO) {
        return wastageService.recordWastage(wastageDTO);
    }

    @PatchMapping("{id}")
    public void updateWastage(@PathVariable long id, @RequestBody WastageDTO wastageDTO) {
        wastageService.updateWastage(id, wastageDTO);
    }

    @DeleteMapping("{id}")
    public void deleteWastage(@PathVariable long id) {
        wastageService.deleteWastage(id);
    }
}
