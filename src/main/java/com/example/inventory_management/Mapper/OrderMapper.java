package com.example.inventory_management.Mapper;

import com.example.inventory_management.DTO.OrderDTO;
import com.example.inventory_management.entity.OrderEntity;

public class OrderMapper {

    public static OrderDTO entityToDto(OrderEntity entity) {
        OrderDTO dto = new OrderDTO();
        dto.setQuantity(entity.getQuantity());
        dto.setOrderDate(entity.getOrder_date());
        dto.setDeliveryDate(entity.getDelivery_date());
        dto.setProduct_id(entity.getProduct_id().getId());
        return dto;
    }

    public static OrderEntity dtoToEntity(OrderDTO dto) {
        OrderEntity entity = new OrderEntity();
        entity.setQuantity(dto.getQuantity());
        entity.setOrder_date(dto.getOrderDate());
        entity.setDelivery_date(dto.getDeliveryDate());
        return entity;
    }
}
