package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.ProductDTO;
import com.example.inventory_management.Mapper.ProductMapper;
import com.example.inventory_management.entity.ProductEntity;
import com.example.inventory_management.entity.SupplierEntity;
import com.example.inventory_management.repository.ProductRepository;
import com.example.inventory_management.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public ProductDTO getProduct(Long id) {
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        return productEntity.map(ProductMapper::entityToDto).orElse(null);
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        List<ProductEntity> productEntities = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            productDTOList.add(ProductMapper.entityToDto(productEntity));
        }
        return productDTOList;
    }

    @Override
    public ProductDTO createProduct(ProductDTO productDTO) {
       SupplierEntity s = supplierRepository.findById(productDTO.getSupplier_id()).orElseThrow(() -> new RuntimeException("Supplier Not Found"));;
        ProductEntity productEntity = ProductMapper.dtoToEntity(productDTO);
        productEntity.setSupplier_id(s);
        productRepository.save(productEntity);
        return productDTO;
    }

    @Override
    public void updateProduct(Long id, ProductDTO productDTO) {
        ProductEntity product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        product.setProduct_name(productDTO.getProductName());
        product.setProduct_price(productDTO.getProductPrice());

        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
