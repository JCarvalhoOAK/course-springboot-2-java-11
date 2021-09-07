package com.JCarvalhoOAK.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.JCarvalhoOAK.course.entities.Category;
import com.JCarvalhoOAK.course.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
		/**
		 * Instancia manual:
		 * 	@GetMapping
	     * public ResponseEntity<Category> findAll(){
		 * Category user = new Category(1L, "Maria", "maria@gmail.com", "99999999", "12345");
		 * return ResponseEntity.ok().body(user);
		 */
		}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
