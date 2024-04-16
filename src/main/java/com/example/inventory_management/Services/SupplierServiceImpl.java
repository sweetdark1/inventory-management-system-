package com.example.inventory_management.Services;

import com.example.inventory_management.entity.SupplierEntity;
import com.example.inventory_management.repository.SupplierRepository;
import com.example.inventory_management.DTO.SupplierDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
            SupplierDTO supplierDTO = new SupplierDTO();

        }else {
            return null;
        }
        return null;
    }
    public List<SupplierDTO> getAllSuppliers() {
        List<SupplierEntity> supplierEntities = supplierRepository.findAll();
        List<SupplierDTO> supplierDTOList = new ArrayList<>();
        for (SupplierEntity supplierEntity : supplierEntities) {
            //you need to bulid a mapper then convert dto to entity and returen dto
            SupplierDTO supplierDTO = new SupplierDTO();
        }
        return supplierDTOList;

    }
    @Bean
    public SupplierDTO createSupplier(SupplierDTO supplierDTO) {
        //you need to get the supplier info from the dto convert it to entity then give the entity to the repostry to save it
        SupplierEntity supplierEntity = new SupplierEntity();
        //instead of null mapper when it returns entity
        SupplierRepository supplierRepository = null;
        supplierRepository.save(supplierEntity);
        return supplierDTO;
    }
    public SupplierDTO updateSupplier(long id,SupplierDTO supplierDTO) {
        SupplierRepository supplierRepository = null;
        SupplierEntity supplierEntity = new SupplierEntity();
        supplierRepository.save(supplierEntity);
        supplierRepository.findById(id);
        return supplierDTO;
    }
    public void deleteSupplier(long id) {
        SupplierRepository supplierRepository = null;
        supplierRepository.deleteById(id);
    }


}
