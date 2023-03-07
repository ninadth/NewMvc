package com.BikkadIT.SendingDataUIToController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {

	@GetMapping("/Addition/{a}/{b}")
	public String Addition(@PathVariable int a,@PathVariable int b, Model model) {
		
		int c=a+b;
		String msg="ADDITION OF A AND B: "+c;
		System.out.println("ADDITION OF A AND B: " +c);
		model.addAttribute("MSG", msg);
		
		return "add";
	}
	
}
