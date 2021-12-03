package com.cardealership.controller;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cardealership.entity.Car;
import com.cardealership.entity.Customer;
import com.cardealership.entity.Dealer;
import com.cardealership.entity.Employee;

import CarService.Listing;

@Controller
public class EmployeeController {
	@Autowired
	carService carService;

	@Autowired
	CustomerService custService;

	@Autowired
	EmployeeService emloyee;

	@GetMapping("index")

	public String welcome(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		if (session.getAttribute("signedIn") == null) {

			return "index";
		}
		model.addAttribute("inventory", carService.allCars());
		model.addAttribute("carsSold", carService.soldCarsList());
		model.addAttribute("signedIn", carService.searchAll());

		return "index";
	}

	@GetMapping("/searchResult")
	public String searchResult(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		Customer addUser = custService.seacrhByEmail(customer.getEmail());
		if (addUser == null) {
			return "login";
		}
		model.addAttribute("inventory", model.getAttribute("result"));
		session.getAttribute("signedIn");
		return "searchResult";
	}

/*	@GetMapping("/search")
	// @RequestMapping(method = RequestMethod.GET)
	public String search(Model model, HttpSession session) {
		// model.addAttribute("message", "Welcome Dealer");
		return "search";
	}

	@PostMapping("/search")
	public String handleSearch(@RequestParam String search, Model model, HttpSession session) {
		List<Car> result = carService.searchCar(search);
		model.addAttribute("inventory", result);
		model.addAttribute("message", "Item not available");
		return "searchResult";
	}
*/
	@GetMapping("/search")
	public String search(Model model, HttpSession sesion) {
		return "search";
	}
	
	@PostMapping("/search")
	public String handleSearch(@RequestParam String search, Model model, HttpSession session) {
		List<Listing>results = ds.searchAllCars(search);
		model.addAttribute("carList", results);
		model.addAttribute("message", "vehicle not found, search again");
		return "searchResults";
	}
	
	@GetMapping("/searchResults")
	public String searchResults(Model model, @ModelAttribute("lsting")Listing listing, HttpSession session) {
		model.addAttribute("carList", model.getAttribute("results"));
		//session.getAttribute()
		return "searchResults";
	}
	
	
	@GetMapping("signUp")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("signUp", "customer", new Customer());
	}

	@PostMapping("/signUp")
	public String handleSignUp(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		custService.saveUser(customer);
		model.addAttribute("addUser", customer);
		return "welcome";
	}

	@GetMapping("/login", "/home")
	public ModelAndView signUp(Model model) {
		return new ModelAndView("logiin", "customer", new Customer());
	}

	@PostMapping("login")
	public String handleLogin(Model model, @ModelAttribute("customer") Customer customer, HttpSession session) {
		model.addAttribute("inventory", carService.allcars());
		Customer addUser = custService.searchByEmail(customer.getEmail());
		if(addUser != null && addUser.getPassword().equals(customer.getPassword()) {
			model.addAttribute("inventory", carSerevice.allCars());
			model.addAttribute("carsSold", carSerevice.soldCars());
			model.addAttribute("purchase", employees.searchAll());
		}
		
		model.addAttribute("addUser", customer);
		return "welcome";
	}

	@GetMapping("Employeesign-up")
	// @RequestMapping(method = RequestMethod.GET)
	public String welcome(Model model) {
		// model.addAttribute("message", "Welcome Dealer");

		return "employee";
	}

	// transfer to next page
	@GetMapping("/employeesign-up")
	public ModelAndView dealer(Model model) {
		// when a user wants t view this page, this servlet will handle the the request
		// and add
		// a ModelAttribute object to map to the dealersign-up page
		return new ModelAndView("employeesign-up", "employee", new Employee());
	}

	@PostMapping("employeesign-up")
	public String handleDealersignup(Model model, @ModelAttribute("employee") Employee employee, HttpSession session) {
		return "";
	}

	@PostMapping("/addCar")
	public String handleAddCar(Model model, @ModelAttribute("car" Car car, HttpSession session) {
		car.setVin(Math.random()*);
		car.setCarPics("./images/vehicle-photos.jpg");
		carService.saveCar(car);
		model.addAttribute("newCar", car);
		return "addedCar";
	}

	@GetMapping("/carInfo")
	public String carInfo(Model model, @RequestParam double vin, HttpSession sesion) {
		session.getAttribute("signedIn");
		LocalDate day = LocalDate.now();
		long age = ChronoUnit.DAYS.between(carService.earchSoldVin(vin).getPurchaseDate(), day);
		model.addAttribute("carInfo", carService.serchSoldVin(vin));
		model.addAttribute("dayPurchase".age);
		return "carInfo";
	}

	@GetMapping("/purchase")
	public String purchase(@RequestParam double vin, Model model, @RequestParam String email, HttpSession sesion) {
		model.getAttribute("signedIn", custService.searchByEmail(email));
		model.addAttribute("carInfo", carService.serchSoldVin(vin));
		employee.soldCar(vin, email);
		carService.soldcar(vin);
		return "purchase";
	}

	@GetMapping("/bidding")
	public String biding(@RequestParam double vin, Model model, @RequestParam String email, HttpSession sesion) {
		model.getAttribute("signedIn", custService.searchByEmail(email));
		model.addAttribute("carInfo", carService.serchSoldVin(vin));
		employee.soldCar(vin, email);
		carService.soldcar(vin);
		return "purchase";
	}

	@PostMapping("/bidding")
	public String handleBid(@Requestparam double vin, @RequestParam String biddingAmount, @RequestParam String email, Model model)  {
		model.addAttribute("signedIn", custService.searchByemail(email));
		ChronoLocalDate day = LocalDate.now();
		long age = ChronoUnit.DAYS.between(carService.seacrhSoldVin(vin).getPurchased(), day);
		model.getAttribute("carInfo", carService.searchSoldVin(vin));
		model.addAttribute("daysPurchase", age);
		int bidding = Integer.parseIntbiddingAmount);
	if(bidding>= carService.searchSoldVin(vin).getPrice
	}

	// @RequestMapping(value = "/dealer", method = RequestMethod.GET)
	// public ModelAndView dealer() {
	// return new ModelAndView("dealersign-up", "command", new Dealer());
	// }

	// called by POST method & displays dealer info
	/*
	 * @RequestMapping(value = "addDealer", method = RequestMethod.POST) public
	 * String addDealer(@ModelAttribute("cardealership") Dealer dealer, ModelMap
	 * model) { model.addAttribute("firstName", dealer.getFirstName());
	 * model.addAttribute("lastName", dealer.getLastName());
	 * model.addAttribute("companyName", dealer.getNameCompany());
	 * model.addAttribute("firstName", dealer.getEmail());
	 * 
	 * return "dealer vehview"; }
	 */
}
