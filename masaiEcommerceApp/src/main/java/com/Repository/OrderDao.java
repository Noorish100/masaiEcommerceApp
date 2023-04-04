package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Orders;



public interface OrderDao extends JpaRepository<Orders, Integer>{

}
