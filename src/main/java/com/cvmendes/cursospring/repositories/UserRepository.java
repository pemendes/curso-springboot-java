package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvmendes.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}