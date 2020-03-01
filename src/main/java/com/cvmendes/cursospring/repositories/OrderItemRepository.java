package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvmendes.cursospring.entities.OrderItem;
import com.cvmendes.cursospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}