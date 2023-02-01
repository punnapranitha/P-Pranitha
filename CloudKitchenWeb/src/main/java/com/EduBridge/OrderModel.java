package com.EduBridge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@JsonIgnoreProperties({"hibernateLazyInitializer"})

@Entity
public class OrderModel {
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE)
int id;
String name;
String email;
String number;
String foodname;
String address;
public OrderModel() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getFoodname() {
	return foodname;
}
public void setFoodname(String foodname) {
	this.foodname = foodname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public OrderModel(int id, String name, String email, String number, String foodname, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.number = number;
	this.foodname = foodname;
	this.address = address;
}
}