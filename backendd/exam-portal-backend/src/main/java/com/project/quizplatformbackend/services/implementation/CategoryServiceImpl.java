package com.project.quizplatformbackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.quizplatformbackend.models.Category;
import com.project.quizplatformbackend.repository.CategoryRepository;
import com.project.quizplatformbackend.services.CategoryService;
import com.project.quizplatformbackend.services.exception.CategoryNotFoundException;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public List<Category> getCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategory(Long catId) {
        return categoryRepository.findById(catId)
                .orElseThrow(() -> new CategoryNotFoundException("Category with id " + catId + " not found"));
    }

    @Override
    public Category updateCategory(Category category) {
        if (categoryRepository.existsById(category.getCatId())) {
            return categoryRepository.save(category);
        }
        throw new CategoryNotFoundException("Category with id " + category.getCatId() + " does not exist");
    }

    @Override
    public void deleteCategory(Long categoryId) {
        if (categoryRepository.existsById(categoryId)) {
            categoryRepository.deleteById(categoryId);
        } else {
            throw new CategoryNotFoundException("Category with id " + categoryId + " does not exist");
        }
    }
}
