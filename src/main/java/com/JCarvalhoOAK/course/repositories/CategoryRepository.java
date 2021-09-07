package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	
	

}
