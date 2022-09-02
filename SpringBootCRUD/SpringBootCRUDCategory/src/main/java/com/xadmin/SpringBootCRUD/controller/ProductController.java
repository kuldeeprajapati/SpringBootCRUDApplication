package com.xadmin.SpringBootCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCRUD.bean.Product;
import com.xadmin.SpringBootCRUD.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/products")
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products")
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
	public void updateProduct(@PathVariable String id,@RequestBody Product product) {
		productService.updateProduct(id,product);
	}
	
	public void deleteProduct(@PathVariable String id) {
		productService.deleteProduct(id);
	}
}
