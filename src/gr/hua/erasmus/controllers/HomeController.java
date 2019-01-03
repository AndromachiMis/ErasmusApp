package gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("invalidlogin")
	public String invalidlogin() {
		return "invalidlogin";
	}

}
