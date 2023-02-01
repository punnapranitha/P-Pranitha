package com.EduBridge;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity

public class LoginModel {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
int id;

String email;
String password;

public LoginModel() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public LoginModel(int id, String email, String password) {
	super();
	this.id = id;
	
	this.email = email;
	this.password = password;
	
}

}