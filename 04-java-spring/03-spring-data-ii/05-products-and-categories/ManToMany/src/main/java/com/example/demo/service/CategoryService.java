package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;

    public List<Category> categoryList() {
        return this.categoryRepo.findAll();
    }

    public Category createCategory(Category newCategory) {
        return this.categoryRepo.save(newCategory);
    }
}
