package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class CategoryController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/categories")
    public String listProducts(Model model) {
        model.addAttribute("categories", this.categoryService.categoryList());
        return "/view/categories.jsp";
    }

    @RequestMapping("/categories/new")
    public String createCategory(@ModelAttribute("category") Category category) {
        return "/view/newCategories.jsp";
    }

    @RequestMapping("/newCategory")
    public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/view/newCategories.jsp";
        } else {
            this.categoryService.createCategory(category);
            return "redirect:/categories";
        }
    }
}
