package gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HeadSecretaryController {

	@RequestMapping("/addService")
	public String addService() {
		return "servicespage";
	}

	@RequestMapping("/addStudent")
	public String addStudent() {
		return "addstudent";
	}

	@RequestMapping("/adduniversity")
	public String addUniversity() {
		return "adduniversity";
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
