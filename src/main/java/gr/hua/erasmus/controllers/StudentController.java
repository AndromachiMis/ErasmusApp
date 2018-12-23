package gr.hua.erasmus.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")

public class StudentController {

	@RequestMapping("/submitform")
	public String submitForm() {
		return "form";
	}

	@RequestMapping("/universitylist")
	public String universityList() {
		return "unilist";
	}

}
