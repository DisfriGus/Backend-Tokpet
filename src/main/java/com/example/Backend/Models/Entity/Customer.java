package com.example.Backend.Models.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "customer")
public class Customer {

    @Id
    private String id;
    private String username;
    private String password;
    private String email;
    private String address;
    private String phoneNumber;

    private String customerToken;
    private List<List<Object>> riwayat;

    public List<List<Object>> getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(List<List<Object>> riwayat) {
        this.riwayat = riwayat;
    }

    public Customer() {
        // Konstruktor default kosong diperlukan oleh Jackson
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getCustomerToken() {
        return customerToken;
    }

    public void setCustomerToken(String customerToken) {
        this.customerToken = customerToken;
    }
}
