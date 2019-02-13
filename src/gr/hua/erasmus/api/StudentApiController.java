package gr.hua.erasmus.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import gr.hua.erasmus.dao.StudentDAO;
import gr.hua.erasmus.entities.Student;


@RestController
@RequestMapping("/api")
public class StudentApiController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/students")
	public List<Student> listStudents(){
		List<Student> student = studentDAO.getAll();
		return student;
	}
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		Student theStudent = studentDAO.getById(studentId);
		if (theStudent==null) {
			try {
				throw new Exception("Student id not found" + studentId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return theStudent;
	}	
		
	@PostMapping("/addstudent")
	//public Student addStudent(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("fullname") String fullname) {
		//return student;
	//}

	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student theStudent) {
		studentDAO.update(theStudent);
		return theStudent;
	}
	
	
}
