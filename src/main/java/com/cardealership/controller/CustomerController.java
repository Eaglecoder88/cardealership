package com.cardealership.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cardealership.entity.Customer;

@Controller
public class CustomerController {
		
 	@GetMapping("/")
	public String welcome(Model model) {
		return "/";
	}
 	
 	
 	@GetMapping("/dealer")
	public String dealer(Model model) {

		return "/Dealer";
	}

}
	
/*	@GetMapping("/customer")
	public ModelAndView customersignup(Model model) {
		return new ModelAndView("customer", "customer", new Customer());
	}
	
	@PostMapping("customersignup")
	public String handleSignup(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		return "";
	}
*/

