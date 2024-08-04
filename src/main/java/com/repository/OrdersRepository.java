package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer>{
	
	@Query("select p.pname,p.price,o.oid,o.qty from Product p, Orders o where p.pid=o.pid")
	public Object[] vieworderinfo();
}