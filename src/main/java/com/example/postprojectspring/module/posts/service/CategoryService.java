package com.example.postprojectspring.module.posts.service;

import com.example.postprojectspring.module.posts.entity.Categories;
import com.example.postprojectspring.module.posts.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public Categories registerCategory(Categories category) {
        return this.categoryRepository.save(category);
    }

    public List<Categories> findAllCategories() {
        return this.categoryRepository.findAll();
    }


}
