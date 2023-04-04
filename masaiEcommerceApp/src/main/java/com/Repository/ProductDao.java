package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Products;



public interface ProductDao extends JpaRepository<Products, Integer> {

}
