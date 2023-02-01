package com.EduBridge;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
	@Autowired
	OrderRepository pr;	
public OrderService() {	
}
public List getAllPlayers() {
	return pr.findAll();
}
//public PlayersModel getPlayerById(int id) {
//	return pr.getById(id);	
//}
public OrderModel getPlayerById(int id) {
	
	Optional<OrderModel> pm=pr.findById(id);//inbuild DOA layer
	if(pm.isPresent()) {
		//System.out.println(pm.get().getName());
		return pm.get() ;
            
	}else 
	return null;
}
public void saveData(OrderModel p) {
	pr.save(p);
}
public void updateData(OrderModel p1) {
	pr.save(p1);
}
public void removePlayer(OrderModel p) {
	int id=p.getId();
	OrderModel q=pr.getById(id);
	pr.delete(q);
}
public void usernamelogin(OrderModel u) {
	pr.save(u);
}
public void passwordlogin(OrderModel p) {
	pr.save(p);
}
}