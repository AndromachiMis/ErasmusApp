package gr.hua.erasmus.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.erasmus.dao.LoginDAO;
import gr.hua.erasmus.dao.StudentDAO;
import gr.hua.erasmus.entities.Student;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/")
public class LoginApiController {
	
	@Autowired
	private LoginDAO loginDAO;	
	
	@PostMapping(value="/login")		
	public String successlogin(@RequestParam String username, @RequestParam String password) {
		String role = loginDAO.login(username, password);
		return role;
	}
	
	
	
	

	
	



}
