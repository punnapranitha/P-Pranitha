package com.EduBridge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class RegisterModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int id;
 String name;
 String email;
 String pswd;
 String cpswd;
 public RegisterModel() {
	 
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
public String getPswd() {
	return pswd;
}
public void setPswd(String pswd) {
	this.pswd = pswd;
}
public String getCpswd() {
	return cpswd;
}
public void setCpswd(String cpswd) {
	this.cpswd = cpswd;
}
public RegisterModel(int id, String name, String email, String pswd, String cpswd) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.pswd = pswd;
	this.cpswd = cpswd;
}
 
}