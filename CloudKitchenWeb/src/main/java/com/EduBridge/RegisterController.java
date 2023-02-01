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
public class RegisterController {
	
		@Autowired
		RegisterService ps;
		@GetMapping("view11")
		public List<RegisterModel> getAllRecords(){
			return ps.getAllPlayers();
					
		}

		@PostMapping("viewI2")
		public RegisterModel getPlayer(@RequestBody RegisterModel id) {
		int id1=id.getId();
		return ps.getPlayerById(id1);
	    }

		@PostMapping("insert2")
		public void addPlayer(@RequestBody RegisterModel p){
			System.out.println("i am in controller class");
			this.ps.saveData(p);
		}
		@PostMapping("update2")
		public void modifyPlayer(@RequestBody RegisterModel p1) {
			this.ps.updateData(p1);
		}

		@PostMapping("delete2")
		public void deletePlayer(@RequestBody RegisterModel p1 ) {
			this.ps.removePlayer(p1);
		}
}