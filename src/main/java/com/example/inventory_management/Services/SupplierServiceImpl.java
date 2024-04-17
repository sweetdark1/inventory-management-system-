package com.example.inventory_management.Services;

import com.example.inventory_management.Mapper.SupplierMapper;
import com.example.inventory_management.entity.SupplierEntity;
import com.example.inventory_management.repository.SupplierRepository;
import com.example.inventory_management.DTO.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;


    @Override
    public SupplierDTO getSupplier(Long id) {
        Optional<SupplierEntity> supplierEntity = supplierRepository.findById(id);
        if (supplierEntity.isPresent()) {
            return SupplierMapper.entityToDto(supplierEntity.get());

        }else {
            //add exption here
            return null;
        }

    }
    public List<SupplierDTO> getAllSuppliers() {
        List<SupplierEntity> supplierEntities = supplierRepository.findAll();
        List<SupplierDTO> supplierDTOList = new ArrayList<>();
        for (SupplierEntity supplierEntity : supplierEntities) {
            supplierDTOList.add(SupplierMapper.entityToDto(supplierEntity));
        }
        return supplierDTOList;

    }
    public SupplierDTO createSupplier(SupplierDTO supplierDTO) {
        supplierRepository.save(SupplierMapper.dtoToEntity(supplierDTO));
        //instead of null mapper when it returns entity
        return supplierDTO;

    }
    public void updateSupplier(long id,SupplierDTO supplierDTO) {
        SupplierEntity supplier =supplierRepository.findById(id).orElseThrow(()->new RuntimeException("Supplier not found"));
        if(supplierDTO.getContactInfo()!=null)
        supplier.setContact_info(supplierDTO.getContactInfo());
        if(supplierDTO.getName()!=null)
        supplier.setName(supplierDTO.getName());

        supplierRepository.save(supplier);
    }
    public void deleteSupplier(long id) {
        supplierRepository.deleteById(id);
    }


}
