package com.example.postprojectspring.module.posts.controller;

import com.example.postprojectspring.module.posts.entity.Categories;
import com.example.postprojectspring.module.posts.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping(value = "/category/list", method = RequestMethod.GET)
    public List<Categories> getCategories() {
        return categoryService.findAllCategories();
    }

    @RequestMapping(value = "/category/create", method = RequestMethod.POST)
    public Categories registerCategory(@RequestBody Categories category) {
        return categoryService.registerCategory(category);
    }
}
