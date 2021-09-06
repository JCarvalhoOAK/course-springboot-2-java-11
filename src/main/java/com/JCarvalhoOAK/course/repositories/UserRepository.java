package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	

}
