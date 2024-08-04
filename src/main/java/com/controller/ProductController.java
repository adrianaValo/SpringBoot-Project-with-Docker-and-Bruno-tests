package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Product;
import com.service.ProductService;

@RestController
@RequestMapping("product")   // http://localhost:8080/product/*
public class ProductController {

	@Autowired
	ProductService productService;
	
	
	// http://localhost:8080/findAllProducts 
	
//	@RequestMapping(value = "findAllProducts",method = RequestMethod.GET,
//			produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Product> findAllProducts() {
//		return productService.findAllProduct();
//	}
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAllProducts() {
		return productService.findAllProduct();
	}
	
	@GetMapping(value = "findbyid/{pid}")
	public String searchProductById(@PathVariable("pid") int pid) {
		return productService.searchProductById(pid);
	}
	
	@PostMapping(value = "store",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String storeProduct(@RequestBody Product product) {
		return productService.storeProduct(product);
	}
	
	@DeleteMapping(value = "delete/{pid}")
	public String deleteProduct(@PathVariable("pid") int pid) {
		return productService.deleteProductById(pid);		
	}
	
	@PatchMapping(value = "updateprice",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductPrice(@RequestBody Product product) {
		return productService.updateProductPrice(product);
	}
	
	@PatchMapping(value = "updateqty",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateProductQty(@RequestBody Product product) {
		return productService.updateProductQty(product);
	}
}