package com.example.Backend.Controllers;

import com.example.Backend.Models.Entity.Customer;
import com.example.Backend.Models.Entity.Order;
import com.example.Backend.Models.Repository.OrderRepo;
import com.example.Backend.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<String> saveOrder(@RequestBody Order order) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Added " + order.getId());
    }

    @GetMapping
    public List<Order> getCustomer() {
        return orderService.allOrder();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> singleOrder(@PathVariable String id) {

        Optional<Order> order = orderService.singleOrder(id);
        if (order.isPresent()) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
