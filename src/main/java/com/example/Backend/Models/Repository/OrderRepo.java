package com.example.Backend.Models.Repository;

import com.example.Backend.Models.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo  extends MongoRepository<Order, String> {

}
