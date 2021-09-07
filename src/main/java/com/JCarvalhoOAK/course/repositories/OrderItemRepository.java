package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
	

}
