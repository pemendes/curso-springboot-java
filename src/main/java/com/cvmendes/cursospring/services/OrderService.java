package com.cvmendes.cursospring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cvmendes.cursospring.entities.Order;
import com.cvmendes.cursospring.entities.User;
import com.cvmendes.cursospring.repositories.OrderRepository;

// anotation pour enregistrer OrderrService 

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}