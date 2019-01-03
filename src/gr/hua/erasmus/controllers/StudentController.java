package gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	
	@RequestMapping("/studentpage")
	public String studentpage() {
		return "student";
	}

	@RequestMapping("/submitForm")
	public String submitForm() {
		return "form";
	}

	@RequestMapping("/universityList")
	public String universityList() {
		return "unilist";
	}

}
