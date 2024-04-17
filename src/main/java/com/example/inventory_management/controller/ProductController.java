package com.example.inventory_management.controller;

import com.example.inventory_management.DTO.ProductDTO;
import com.example.inventory_management.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/products")
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("{id}")
    public ProductDTO getProduct(@PathVariable long id) {
        return productService.getProduct(id);
    }

    @GetMapping("")
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @PatchMapping("{id}")
    public void updateProduct(@PathVariable long id, @RequestBody ProductDTO productDTO) {
        productService.updateProduct(id, productDTO);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable long id) {
        productService.deleteProduct(id);
    }
}
