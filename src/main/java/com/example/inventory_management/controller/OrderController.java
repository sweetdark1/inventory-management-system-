package com.example.inventory_management.controller;

import com.example.inventory_management.DTO.OrderDTO;
import com.example.inventory_management.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orders")
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public OrderDTO getOrder(@PathVariable long id) {
        return orderService.getOrder(id);
    }

    @GetMapping("")
    public List<OrderDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public OrderDTO placeOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.placeOrder(orderDTO);
    }

    @PatchMapping("{id}")
    public void updateOrder(@PathVariable long id, @RequestBody OrderDTO orderDTO) {
        orderService.updateOrder(id, orderDTO);
    }

    @DeleteMapping("{id}")
    public void deleteOrder(@PathVariable long id) {
        orderService.deleteOrder(id);
    }
}
