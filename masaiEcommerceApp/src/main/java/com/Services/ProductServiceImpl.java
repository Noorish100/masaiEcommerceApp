package com.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.Entity.Products;
import com.Repository.ProductDao;

public class ProductServiceImpl implements ProductServices{

	@Autowired
	private ProductDao productDao;
	
	@Override
	public List getProducts() {
		
		return productDao.findAll();
	}

	@Override
	public Products getProductById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		Optional<Products> prod = productDao.findById(id);
		if(prod.isEmpty()) {
		throw new Exception("not found");
		}
		return prod.get();
	}

}
