package com.example.inventory_management.Services;

import com.example.inventory_management.DTO.OrderDTO;
import com.example.inventory_management.Mapper.OrderMapper;
import com.example.inventory_management.entity.OrderEntity;
import com.example.inventory_management.entity.ProductEntity;
import com.example.inventory_management.repository.OrderRepository;
import com.example.inventory_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;

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
       ProductEntity p = productRepository.findById(orderDTO.getProduct_id()).orElseThrow(() -> new RuntimeException("Product not found"));
        OrderEntity orderEntity = OrderMapper.dtoToEntity(orderDTO);
        orderEntity.setProduct_id(p);
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
