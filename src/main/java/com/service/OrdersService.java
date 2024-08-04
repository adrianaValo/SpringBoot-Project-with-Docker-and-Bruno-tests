package com.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Orders;
import com.entity.Product;
import com.repository.OrdersRepository;
import com.repository.ProductRepository;

@Service
public class OrdersService {

	@Autowired
	OrdersRepository ordersRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	public String placeOrder(Orders order) {
		try {
			
		Optional<Product> result = productRepository.findById(order.getPid());
		if(result.isPresent()) {
			order.setOrderdatainfo(LocalDateTime.now());
			ordersRepository.save(order);
			
			Product p = result.get();
			p.setQty(p.getQty()-order.getQty());
			productRepository.saveAndFlush(p);
			
			return "Order placed succesfully";
		}else {
			return "Product not present ";
		}
		
		}catch(Exception e) {
			System.err.println(e);
			return "Order didn't place";
		}
	}
	
	public Object[] viewOrders() {
		return ordersRepository.vieworderinfo();
	}
}