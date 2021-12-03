package com.cardealership.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cardealership.entity.Dealer;
import com.cardealership.entity.Employee;

@Controller
public class EmployeeController2 {
	
	@GetMapping("Employeesign-up")
	// @RequestMapping(method = RequestMethod.GET)
	public String welcome(Model model) {
		// model.addAttribute("message", "Welcome Dealer");

		return "employee";
	}

	// transfer to next page
	@GetMapping("/employeesign-up")
	public ModelAndView dealer(Model model) {
		//when a user wants t view this page, this servlet will handle the the request and add
		//a ModelAttribute object to map to the dealersign-up page
		return new ModelAndView ("employeesign-up", "employee", new Employee());
	}

	@PostMapping("employeesign-up")
	public String handleDealersignup(Model model, @ModelAttribute("employee") Employee employee, HttpSession session) {
		return "";
	}

	//@RequestMapping(value = "/dealer", method = RequestMethod.GET)
	//public ModelAndView dealer() {
	//	return new ModelAndView("dealersign-up", "command", new Dealer());
	//}

	// called by POST method & displays dealer info
/*	@RequestMapping(value = "addDealer", method = RequestMethod.POST)
	public String addDealer(@ModelAttribute("cardealership") Dealer dealer, ModelMap model) {
		model.addAttribute("firstName", dealer.getFirstName());
		model.addAttribute("lastName", dealer.getLastName());
		model.addAttribute("companyName", dealer.getNameCompany());
		model.addAttribute("firstName", dealer.getEmail());

		return "dealer vehview";
	}
*/
}
	

	
