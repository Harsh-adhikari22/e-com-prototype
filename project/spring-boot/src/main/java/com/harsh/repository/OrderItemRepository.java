package com.harsh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
