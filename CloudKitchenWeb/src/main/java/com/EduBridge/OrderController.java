package com.EduBridge;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class OrderController {
	@Autowired
 OrderService ps;
	@GetMapping("view1")
	public List<OrderService> getAllRecords(){
		return ps.getAllPlayers();
				
	}

	@PostMapping("viewI1")
	public OrderModel getPlayer(@RequestBody OrderModel id) {
	int id1=id.getId();
	return ps.getPlayerById(id1);
    }

	@PostMapping("insert1")
	public void addPlayer(@RequestBody OrderModel p){
		this.ps.saveData(p);
	}
	@PostMapping("update1")
	public void modifyPlayer(@RequestBody OrderModel p1) {
		this.ps.updateData(p1);
	}

	@PostMapping("delete1")
	public void deletePlayer(@RequestBody OrderModel p1 ) {
		this.ps.removePlayer(p1);
	}


}