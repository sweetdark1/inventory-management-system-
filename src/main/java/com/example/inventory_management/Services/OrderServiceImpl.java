package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.OrderDTO;
import com.example.inventory_management.Mapper.OrderMapper;
import com.example.inventory_management.entity.OrderEntity;
import com.example.inventory_management.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderDTO getOrder(Long id) {
        Optional<OrderEntity> orderEntity = orderRepository.findById(id);
        return orderEntity.map(OrderMapper::entityToDto).orElse(null);
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        List<OrderEntity> orderEntities = orderRepository.findAll();
        List<OrderDTO> orderDTOList = new ArrayList<>();
        for (OrderEntity orderEntity : orderEntities) {
            orderDTOList.add(OrderMapper.entityToDto(orderEntity));
        }
        return orderDTOList;
    }

    @Override
    public OrderDTO placeOrder(OrderDTO orderDTO) {
        OrderEntity orderEntity = OrderMapper.dtoToEntity(orderDTO);
        orderRepository.save(orderEntity);
        return orderDTO;
    }

    @Override
    public void updateOrder(Long id, OrderDTO orderDTO) {
        OrderEntity order = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setQuantity(orderDTO.getQuantity());
        order.setOrder_date(orderDTO.getOrderDate());
        order.setDelivery_date(orderDTO.getDeliveryDate());

        orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
