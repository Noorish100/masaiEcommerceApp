package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
