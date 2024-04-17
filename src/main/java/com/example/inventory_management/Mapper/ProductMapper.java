package com.example.inventory_management.Mapper;
import com.example.inventory_management.DTO.ProductDTO;
import com.example.inventory_management.entity.ProductEntity;
import com.example.inventory_management.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductMapper {

    public static ProductDTO entityToDto(ProductEntity entity) {
        ProductDTO dto = new ProductDTO();
        dto.setId(entity.getId());
        dto.setProductName(entity.getProduct_name());
        dto.setProductPrice(entity.getProduct_price());
        dto.setSupplier_id(entity.getSupplier_id().getSupplier_id());
        return dto;
    }

    public static ProductEntity dtoToEntity(ProductDTO dto) {
        ProductEntity entity = new ProductEntity();
        entity.setId(dto.getId());
        entity.setProduct_name(dto.getProductName());
        entity.setProduct_price(dto.getProductPrice());
        return entity;
    }
}
