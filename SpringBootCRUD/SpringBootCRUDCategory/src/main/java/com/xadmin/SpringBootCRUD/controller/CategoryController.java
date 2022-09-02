package com.xadmin.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCRUD.bean.Category;
import com.xadmin.SpringBootCRUD.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/categorys")
	public List<Category> getAllCategorys(){
		return categoryService.getAllCategorys();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/categorys")
	public void addCategory(@RequestBody Category category) {
		categoryService.addCategory(category);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/categorys/{id}")
	public void updateCategory(@PathVariable String id,@RequestBody Category category) {
		categoryService.updateCategory(id,category);
	}
	
	public void deleteCategory(@PathVariable String id) {
		categoryService.deleteCategory(id);
	}
}
