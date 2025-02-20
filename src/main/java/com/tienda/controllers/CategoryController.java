package com.tienda.controllers;

import com.tienda.models.Category;
import com.tienda.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")

public class CategoryController {

@Autowired
    private CategoryService categoryService;

@GetMapping()
    public List<Category> getAllCategories(){
    return categoryService.getAllCategories();

}

@PostMapping("/add")
    public Category addCategory(@RequestBody Category category){
    return categoryService.saveCategory(category);

}
@GetMapping("/getCatById/{id}")
    public Category getCategoryById(@PathVariable Long id){
    return categoryService.getCategoryById(id);

}

@DeleteMapping("/delCategory/{id}")
    public String delCategoryById(@PathVariable Long id){
    categoryService.delCategoryById(id);
    return "Categoria Eliminada";
}

@GetMapping("/find/{name}")
    public Category getCategoryByName(@PathVariable String name) {
    return categoryService.getCategoryByName(name);
}


}
