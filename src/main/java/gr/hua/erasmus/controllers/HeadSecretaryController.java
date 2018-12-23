package main.java.gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/headsecretary")

public class HeadSecretaryController {

	@RequestMapping("/addService")
	public String addService() {
		return "servicespage";
	}

	@RequestMapping("/addStudent")
	public String addStudent() {
		return "servicespage";
	}

	@RequestMapping("/addUniversity")
	public String addUniversity() {
		return "servicespage";
	}

	@RequestMapping("/deleteStudent")
	public String deleteStudent() {
		return "servicespage";

	}

	@RequestMapping("/deleteUniverity")
	public String deleteUniversity() {
		return "servicespage";
	}
}
