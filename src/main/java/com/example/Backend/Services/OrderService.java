package com.example.Backend.Services;

import com.example.Backend.Models.Entity.Order;
import com.example.Backend.Models.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OrderService {
    @Autowired
    public OrderRepo orderRepo;

    public List<Order> allOrder(){
        return (List<Order>) orderRepo.findAll();
    }
    public Optional<Order> singleOrder(String id){
        return orderRepo.findById(id);
    }

}
