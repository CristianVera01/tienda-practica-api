package com.tienda.Services;

import com.tienda.Models.Category;
import com.tienda.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryrepository;

    public List<Category> getAllCategories(){

        return  categoryrepository.findAll();
    }

    public Category saveCategory(Category category){
        return categoryrepository.save(category);

    }
    public Category getCategoryById( Long id){
        return categoryrepository.findById(id).orElse(null);
    }
    public void delCategoryById(Long id){
        categoryrepository.deleteById(id);
    }

}
