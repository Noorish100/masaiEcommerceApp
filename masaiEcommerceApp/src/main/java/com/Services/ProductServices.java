package com.Services;

import java.util.List;

import com.Entity.Products;

public interface ProductServices {
	
	public List getProducts();

	public Products getProductById(Integer id) throws Exception;
}
