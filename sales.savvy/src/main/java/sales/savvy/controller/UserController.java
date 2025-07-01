package sales.savvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;
import sales.savvy.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("*")
@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/signUp")
	public String signUp(@RequestBody User user) {
		return service.addUser(user);		
	}
	
	
	@PostMapping("/signIn")
	public String signIn(@RequestBody LoginData data) {
		return service.validateUser(data);
	}
	
	
}
