package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Products;
import com.Services.ProductServiceImpl;

@RestController
@RequestMapping("/masaiEcommerce")
public class ProductController {
	
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping("/product")
	public ResponseEntity<List> m1() {
		List products = productServiceImpl.getProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Products> m2(@PathVariable Integer id) throws Exception {
		Products products = productServiceImpl.getProductById(id);
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

}
