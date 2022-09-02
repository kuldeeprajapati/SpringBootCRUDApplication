package com.xadmin.SpringBootCRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCRUD.bean.Category;
import com.xadmin.SpringBootCRUD.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	public CategoryRepository categoryRepo;
	public List<Category> getAllCategorys(){
		List<Category> categorys = new ArrayList<>();
		categoryRepo.findAll().forEach(categorys::add);
		return categorys;
	}
	public void addCategory(Category category) {
		categoryRepo.save(category);
		
	}
	public void updateCategory(String id, Category category) {
		Category existingCategory = categoryRepo.findById(category.getId()).orElse(null);
        existingCategory.setName(category.getName());
        existingCategory.setQuantity(category.getQuantity());
        existingCategory.setPrice(category.getPrice());
		categoryRepo.save(category);
		
	}
	public void deleteCategory(String id) {
		categoryRepo.deleteById(id);
		
	}
}
