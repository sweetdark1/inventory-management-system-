package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    OrderDTO getOrder(Long id);
    List<OrderDTO> getAllOrders();
    OrderDTO placeOrder(OrderDTO orderDTO);
    void updateOrder(Long id, OrderDTO orderDTO);
    void deleteOrder(Long id);
}