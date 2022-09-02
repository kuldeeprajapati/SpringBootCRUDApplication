package com.xadmin.SpringBootCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCRUD.bean.Product;
public interface ProductRepository extends CrudRepository<Product,String> {
	
	
}
