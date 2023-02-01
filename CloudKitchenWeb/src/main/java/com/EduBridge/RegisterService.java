package com.EduBridge;

	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service
	public class RegisterService {
		@Autowired
		RegisterRepository pr;	
	public RegisterService() {	
	}
	public List getAllPlayers() {
		return pr.findAll();
	}
	//public PlayersModel getPlayerById(int id) {
//		return pr.getById(id);	
	//}
	public RegisterModel getPlayerById(int id) {
		
		Optional<RegisterModel> pm=pr.findById(id);//inbuild DOA layer
		if(pm.isPresent()) {
			//System.out.println(pm.get().getName());
			return pm.get() ;
	            
		}else 
		return null;
	}
	public void saveData(RegisterModel p) {
		pr.save(p);
	}
	public void updateData(RegisterModel p1) {
		pr.save(p1);
	}
	public void removePlayer(RegisterModel p) {
		int id=p.getId();
		RegisterModel q=pr.getById(id);
		pr.delete(q);
	}
	
}