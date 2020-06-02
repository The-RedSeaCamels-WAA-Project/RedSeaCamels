package mum.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping({"/","/redSeaCamels","/shoppingCart"})
	public String HomePage() {
		return "shoppingCart-Home-Page";
	}

}
