package com.example.inventory_management.Mapper;

import com.example.inventory_management.DTO.WastageDTO;
import com.example.inventory_management.entity.WastageEntity;

public class WastageMapper {

    public static WastageDTO entityToDto(WastageEntity entity) {
        WastageDTO dto = new WastageDTO();
        dto.setId(entity.getId());
        dto.setQuantity(entity.getQuantity());
        dto.setReason(entity.getReason());
        dto.setProduct_id(entity.getProduct_id().getId());
        return dto;
    }

    public static WastageEntity dtoToEntity(WastageDTO dto) {
        WastageEntity entity = new WastageEntity();
        entity.setId(dto.getId());
        entity.setQuantity(dto.getQuantity());
        entity.setReason(dto.getReason());
        return entity;
    }
}
