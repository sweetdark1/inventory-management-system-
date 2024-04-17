package com.example.inventory_management.Mapper;

import com.example.inventory_management.DTO.OrderDTO;
import com.example.inventory_management.entity.OrderEntity;

public class OrderMapper {

    public static OrderDTO entityToDto(OrderEntity entity) {
        OrderDTO dto = new OrderDTO();
        dto.setOrderId(entity.getOrder_id());
        dto.setQuantity(entity.getQuantity());
        dto.setOrderDate(entity.getOrder_date());
        dto.setDeliveryDate(entity.getDelivery_date());
        dto.setProduct(ProductMapper.entityToDto(entity.getProduct_id()));
        return dto;
    }

    public static OrderEntity dtoToEntity(OrderDTO dto) {
        OrderEntity entity = new OrderEntity();
        entity.setOrder_id(dto.getOrderId());
        entity.setQuantity(dto.getQuantity());
        entity.setOrder_date(dto.getOrderDate());
        entity.setDelivery_date(dto.getDeliveryDate());
        entity.setProduct_id(ProductMapper.dtoToEntity(dto.getProduct()));
        return entity;
    }
}
