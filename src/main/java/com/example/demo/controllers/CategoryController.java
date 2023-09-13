package com.example.demo.controllers;

import com.example.demo.model.CategoryEntity;
import com.example.demo.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    //todo: Add missing crud
    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<CategoryEntity>> getAllCategoryEntity() {
        List<CategoryEntity> productEntities = categoryService.findAllCategoryEntity();
        return new ResponseEntity<>(productEntities, HttpStatus.OK);
    }
}
