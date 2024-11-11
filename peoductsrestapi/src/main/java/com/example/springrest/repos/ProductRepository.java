package com.example.springrest.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springrest.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
