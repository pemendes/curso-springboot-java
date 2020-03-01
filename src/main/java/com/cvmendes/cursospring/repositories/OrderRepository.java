package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvmendes.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}