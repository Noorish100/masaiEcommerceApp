package com.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Cart;
import com.Entity.Products;
import com.Entity.User;
import com.Repository.CartDao;
import com.Repository.ProductDao;
import com.Repository.UserDao;
@Service
public class CartServiceImpl implements CartServices{

	@Autowired
	private CartDao cartDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ProductDao productDao;
	@Override
	public void addProduct(Integer product_id,Integer cart_id) {
	Optional<Cart> cart = cartDao.findById(cart_id);
	List<Products> prod = cart.get().getProd();
	Optional<Products> toaddpro = productDao.findById(product_id);
	prod.add(toaddpro.get());
	cartDao.save(cart.get());	
	}



}
