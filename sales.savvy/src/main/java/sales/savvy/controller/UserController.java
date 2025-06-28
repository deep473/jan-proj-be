package sales.savvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;
import sales.savvy.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String signUp(@RequestBody User user) {
		String username = user.getUsername();
		User u = service.getUser(username);
		
		if(u != null) {
			return "fail";
		}
		else {
			service.addUser(user);
			return "success";
		}
		
	}
	
	
	@PostMapping("/signIn")
	public String signIn(@RequestBody LoginData data) {
		return service.validateUser(data);
	}
	
	
}
