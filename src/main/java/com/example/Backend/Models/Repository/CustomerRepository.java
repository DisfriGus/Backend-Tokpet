package com.example.Backend.Models.Repository;
import com.example.Backend.Models.Entity.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    // tambahkan metode kustom jika diperlukan
}

