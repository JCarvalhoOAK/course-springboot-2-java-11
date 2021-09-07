package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	
	

}
