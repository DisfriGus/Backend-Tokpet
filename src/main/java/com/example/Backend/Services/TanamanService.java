package com.example.Backend.Services;

import com.example.Backend.Models.Entity.Tanaman;
import com.example.Backend.Models.Repository.TanamanRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TanamanService {
    @Autowired
    private TanamanRepo tanamanRepo;

    public List<Tanaman> allTanaman(){
        return (List<Tanaman>) tanamanRepo.findAll();
    }
    public Optional<Tanaman> singleTanaman(String id){
        return tanamanRepo.findById(id);
    }

//    public Optional<Tanaman> singleTanamanbyCategory(String categoryId){
//        return tanamanRepo.findTanamanById(categoryId);
//    }
}
