package com.xadmin.SpringBootCRUD.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCRUD.bean.Product;
import com.xadmin.SpringBootCRUD.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	public ProductRepository productRepo;
	public List<Product> getAllProducts(){
		List<Product> products = new ArrayList<>();
		productRepo.findAll().forEach(products::add);
		return products;
	}
	public void addProduct(Product product) {
		productRepo.save(product);
		
	}
	public void updateProduct(String id, Product product) {
		Product existingProduct = productRepo.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
		productRepo.save(product);
		
	}
	public void deleteProduct(String id) {
		productRepo.deleteById(id);
		
	}
}
