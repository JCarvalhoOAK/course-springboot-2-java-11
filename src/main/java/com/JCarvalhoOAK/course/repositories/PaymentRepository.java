package com.JCarvalhoOAK.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JCarvalhoOAK.course.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>  {
	
	

}
