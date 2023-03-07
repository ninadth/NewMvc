package com.BikkadIT.SendingDataUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	

	public WelcomeController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("WELCOME CONSTRUCTOR");
	}

	@GetMapping("/WelcomeMsg")
	public String Welcome(@RequestParam String Name,Model model) {
		
		String msg="Hii "+Name+" How Are You";
		System.out.println(msg);
		
		model.addAttribute("MSG", msg);
		
		return "Welcome";
		
	}
}
