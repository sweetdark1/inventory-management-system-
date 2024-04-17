package com.example.inventory_management.Mapper;

import com.example.inventory_management.DTO.SupplierDTO;
import com.example.inventory_management.entity.SupplierEntity;

public class SupplierMapper {

    public static SupplierDTO entityToDto(SupplierEntity entity) {
        SupplierDTO dto = new SupplierDTO();
        dto.setName(entity.getName());
        dto.setContactInfo(entity.getContact_info());
        return dto;
    }

    public static SupplierEntity dtoToEntity(SupplierDTO dto) {
        SupplierEntity entity = new SupplierEntity();
        entity.setName(dto.getName());
        entity.setContact_info(dto.getContactInfo());
        return entity;
    }
}
