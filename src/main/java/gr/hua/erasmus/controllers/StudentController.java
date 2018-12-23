package main.java.gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")

public class StudentController {

	@RequestMapping("/submitForm")
	public String submitForm() {
		return "form";
	}

	@RequestMapping("/universityList")
	public String universityList() {
		return "unilist";
	}

}
