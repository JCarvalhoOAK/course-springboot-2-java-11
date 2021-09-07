package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	
	

}
