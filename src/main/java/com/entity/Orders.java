package com.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int oid;
private LocalDateTime orderdatainfo;
private int qty;
private Integer pid;		//FK	it can hold null value. 
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public LocalDateTime getOrderdatainfo() {
	return orderdatainfo;
}
public void setOrderdatainfo(LocalDateTime orderdatainfo) {
	this.orderdatainfo = orderdatainfo;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
@Override
public String toString() {
	return "Orders [oid=" + oid + ", orderdatainfo=" + orderdatainfo + ", qty=" + qty + ", pid=" + pid + "]";
}

}