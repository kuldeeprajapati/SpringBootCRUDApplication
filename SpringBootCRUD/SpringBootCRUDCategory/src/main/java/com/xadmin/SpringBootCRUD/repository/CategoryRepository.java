package com.xadmin.SpringBootCRUD.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCRUD.bean.Category;
public interface CategoryRepository extends CrudRepository<Category,String> {
	
	
}
