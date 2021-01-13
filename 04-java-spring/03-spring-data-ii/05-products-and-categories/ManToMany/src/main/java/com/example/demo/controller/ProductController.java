package com.example.demo.controller;

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
public class ProductController {
    @Autowired
    private ProductService productServices;
    @Autowired
    private CategoryService categoryService;


    @RequestMapping("/products")
    public String listProducts(Model model) {
        model.addAttribute("products", this.productServices.findAllProduct());
        return "/view/products.jsp";
    }

    @RequestMapping("/products/new")
    public String newProduct(@ModelAttribute("product") Product product) {
        return "/view/newProductPage.jsp";
    }

    @RequestMapping("/newProduct")
    public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/view/newProductPage.jsp";
        } else {
            this.productServices.newProduct(product);
            return "redirect:/products";
        }
    }
}
