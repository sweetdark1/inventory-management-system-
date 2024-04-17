package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    ProductDTO getProduct(Long id);
    List<ProductDTO> getAllProducts();
    ProductDTO createProduct(ProductDTO productDTO);
    void updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
}