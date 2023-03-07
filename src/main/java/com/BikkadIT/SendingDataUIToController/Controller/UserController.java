package com.BikkadIT.SendingDataUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BikkadIT.SendingDataUIToController.model.User;

@Controller
public class UserController {

	public UserController() {
		super();
		System.out.println("UserController");
	}

	@GetMapping("/loadform")
	public String loadform() {
		
		return "UserForm";
		
	}
	
	@GetMapping("/saveUser")
	public String saveUser( User user,Model model) {
		
		System.out.println(user);
		model.addAttribute("USER", user);
		return "userSuccess";
		
	}
}
