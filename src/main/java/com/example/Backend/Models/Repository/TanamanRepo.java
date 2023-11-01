package com.example.Backend.Models.Repository;

import com.example.Backend.Models.Entity.Tanaman;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanamanRepo extends MongoRepository<Tanaman, String> {
//    Optional<Tanaman> findTanamanById(String categoryId);
}
