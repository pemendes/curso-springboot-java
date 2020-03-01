package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvmendes.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}