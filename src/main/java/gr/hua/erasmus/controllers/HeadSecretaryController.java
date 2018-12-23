package gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/headsecretary")

public class HeadSecretaryController {

	@RequestMapping("/addservice")
	public String addService() {
		return "servicespage";
	}

	@RequestMapping("/addstudent")
	public String addStudent() {
		return "servicespage";
	}

	@RequestMapping("/adduniversity")
	public String addUniversity() {
		return "servicespage";
	}

	@RequestMapping("/deletestudent")
	public String deleteStudent() {
		return "servicespage";

	}

	@RequestMapping("/deleteuniverity")
	public String deleteUniversity() {
		return "servicespage";
	}
}
