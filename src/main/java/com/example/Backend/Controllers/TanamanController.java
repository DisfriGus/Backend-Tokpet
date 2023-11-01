package com.example.Backend.Controllers;

import com.example.Backend.Models.Entity.Tanaman;
import com.example.Backend.Services.TanamanService;
import org.bson.types.ObjectId;
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
@RequestMapping("/api/v1/tanaman")
public class TanamanController {
    @Autowired
    private TanamanService tanamanService;
    @GetMapping
    public ResponseEntity<List<Tanaman>> getAllTanaman(){
        return new ResponseEntity<List<Tanaman>>(tanamanService.allTanaman(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Tanaman>> getSingleTanaman(@PathVariable String id){
        return new ResponseEntity<Optional<Tanaman>>(tanamanService.singleTanaman(id), HttpStatus.OK);
    }
//    @GetMapping("/categoryId}")
//    public ResponseEntity<Optional<Tanaman>> getSingleTanamanbyCategory(@PathVariable String categoryId){
//        return new ResponseEntity<Optional<Tanaman>>(tanamanService.singleTanamanbyCategory(categoryId), HttpStatus.OK);
//    }
}
