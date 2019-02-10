package gr.hua.erasmus.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/students")
	public List<Student> getAll() {
		List<Student> student = studentDAO.getAll();
		return student;
		
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student theStudent) {
		studentDAO.save(theStudent);
		return theStudent;
	}

	@PutMapping("/updatestudent")
	public Student updateStudent(@RequestBody Student theStudent) {
		studentDAO.update(theStudent);
		return theStudent;
	}
	
	@DeleteMapping("/students/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
		Student theStudent = studentDAO.getById(studentId);
				if (theStudent == null) {
					//throw new StudentNotFoundException("Student id not found" + studentId);
					
				}
				studentDAO.deleteById(studentId);
				return "Deleted student id - " + studentId;
	}

}
