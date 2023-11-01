package com.example.Backend.Services;

import com.example.Backend.Models.Entity.Category;
import com.example.Backend.Models.Repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepo categoryRepo;

    public List<Category> allCategory(){
        return (List<Category>) categoryRepo.findAll();
    }

    public Optional<Category> singleCategory(String id){
        return  categoryRepo.findById(id);
    }
}
