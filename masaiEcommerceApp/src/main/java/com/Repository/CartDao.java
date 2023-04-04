package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Cart;



public interface CartDao extends JpaRepository<Cart, Integer> {

}
