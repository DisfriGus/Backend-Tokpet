package com.example.Backend.Models.Repository;

import com.example.Backend.Models.Entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepo extends MongoRepository<Category, String> {
}
