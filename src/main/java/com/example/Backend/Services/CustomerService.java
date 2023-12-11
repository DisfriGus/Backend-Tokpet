package com.example.Backend.Services;

import com.example.Backend.Models.Entity.Customer;
import com.example.Backend.Models.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository ;

    public List<Customer> allCustomer(){
        return (List<Customer>) customerRepository.findAll();
    }
    public Optional<Customer> singleCustomer(String id){
        return customerRepository.findById(id);
    }



    public Optional<Customer> putCustomer(String id){
        return customerRepository.findById(id);
    }




}
