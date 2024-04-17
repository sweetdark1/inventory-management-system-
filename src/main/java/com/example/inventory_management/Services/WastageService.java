package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.WastageDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WastageService {
    WastageDTO getWastage(Long id);
    List<WastageDTO> getAllWastages();
    WastageDTO recordWastage(WastageDTO wastageDTO);
    void updateWastage(Long id, WastageDTO wastageDTO);
    void deleteWastage(Long id);
}
