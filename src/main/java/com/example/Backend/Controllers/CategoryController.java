package com.example.Backend.Controllers;

import com.example.Backend.Models.Entity.Category;
import com.example.Backend.Services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ResponseEntity<List<Category>> getAllCategory(){
        return  new ResponseEntity<List<Category>>(categoryService.allCategory(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public  ResponseEntity<Optional<Category>> getSingleTanaman(@PathVariable String id){
        return  new ResponseEntity<Optional<Category>>(categoryService.singleCategory(id), HttpStatus.OK);
    }
}
