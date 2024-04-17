package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.WastageDTO;
import com.example.inventory_management.Mapper.WastageMapper;
import com.example.inventory_management.entity.ProductEntity;
import com.example.inventory_management.entity.SupplierEntity;
import com.example.inventory_management.entity.WastageEntity;
import com.example.inventory_management.repository.ProductRepository;
import com.example.inventory_management.repository.WastageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WastageServiceImpl implements WastageService {

    @Autowired
    private WastageRepository wastageRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public WastageDTO getWastage(Long id) {
        Optional<WastageEntity> wastageEntity = wastageRepository.findById(id);
        return wastageEntity.map(WastageMapper::entityToDto).orElse(null);
    }

    @Override
    public List<WastageDTO> getAllWastages() {
        List<WastageEntity> wastageEntities = wastageRepository.findAll();
        List<WastageDTO> wastageDTOList = new ArrayList<>();
        for (WastageEntity wastageEntity : wastageEntities) {
            wastageDTOList.add(WastageMapper.entityToDto(wastageEntity));
        }
        return wastageDTOList;
    }

    @Override
    public WastageDTO recordWastage(WastageDTO wastageDTO) {

        WastageEntity wastageEntity = WastageMapper.dtoToEntity(wastageDTO);
        ProductEntity s = productRepository.findById(wastageDTO.getProduct_id()).orElseThrow(() -> new RuntimeException("Supplier Not Found"));
        wastageRepository.save(wastageEntity);
        return wastageDTO;
    }

    @Override
    public void updateWastage(Long id, WastageDTO wastageDTO) {
        WastageEntity wastage = wastageRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Wastage record not found"));
        wastage.setQuantity(wastageDTO.getQuantity());
        wastage.setReason(wastageDTO.getReason());

        wastageRepository.save(wastage);
    }

    @Override
    public void deleteWastage(Long id) {
        wastageRepository.deleteById(id);
    }
}
