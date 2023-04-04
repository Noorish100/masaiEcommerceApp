package com.Services;

import com.Entity.User;

import com.Exception.UserException;

public interface UserServices {

	 public User register(User user) throws UserException;
	
}
