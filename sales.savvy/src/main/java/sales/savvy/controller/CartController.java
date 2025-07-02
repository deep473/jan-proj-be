package sales.savvy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import sales.savvy.dto.CartData;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("*")
@RestController
public class CartController {

	@PostMapping("/addToCart")
	public String addToCart(@RequestBody CartData data) {
		System.out.println(data);
		return "success";
	}
	
}
