package com.app.vehiclerent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.vehiclerent.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
}