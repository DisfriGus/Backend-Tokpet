package com.example.Backend.Controllers;

import com.example.Backend.Models.Entity.Customer;
import com.example.Backend.Models.Repository.CustomerRepository;
import com.example.Backend.Services.CustomerService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body("Added " + customer.getId());
    }

    @GetMapping
    public List<Customer> getCustomer() {
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Customer>> getCustomerById(@PathVariable String id) {

        Optional<Customer> customer = customerRepository.findById(id);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable String id) {

        customerRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Customer with id " + id + " has been deleted");
    }
}
