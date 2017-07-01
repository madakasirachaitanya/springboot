package com.revature.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.spring.model.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
