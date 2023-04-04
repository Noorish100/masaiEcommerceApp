package com.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.User;
import com.Exception.UserException;
import com.Repository.UserDao;

@Service
public class UserServiceImpl implements UserServices {

	
	@Autowired
	private UserDao userdao;

	@Override
	public User register(User user)throws UserException {
		if(user==null) {
			throw new UserException("invalid user");
		}
		// TODO Auto-generated method stub
		return userdao.save(user);
	}
}
