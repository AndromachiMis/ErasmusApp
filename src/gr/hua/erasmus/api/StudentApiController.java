package gr.hua.erasmus.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
import gr.hua.erasmus.dao.FormDAO;
import gr.hua.erasmus.entities.Student;
import gr.hua.erasmus.entities.Form;
import gr.hua.erasmus.entities.Universities;


@RestController
@RequestMapping("/api")
public class StudentApiController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@Autowired
	private FormDAO formDAO;
	
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
	
	@PostMapping(value="/addstudent")	
	public Student addStudent(@RequestParam String username, @RequestParam String password, @RequestParam String fullname, @RequestParam String fathername, @RequestParam String mothername, @RequestParam Integer phone, @RequestParam String status, @RequestParam Integer year, @RequestParam Integer grades, @RequestParam Integer lessons) {
		Student student = new Student (username, password, fullname, fathername, mothername, phone, status, year, grades, lessons);
		studentDAO.save(student);
		return student;
	}
	
	@PostMapping(value="/submitform")
	public Form addForm(@RequestParam String username, @RequestParam String fullname, @RequestParam String fathername, @RequestParam String mothername, @RequestParam Integer phone, @RequestParam Integer year, @RequestParam Integer lessons, @RequestParam String[] universities, @RequestParam String cert ) {
		Form form = new Form (username, fullname, fathername, mothername, phone, year, lessons, universities, cert);
		formDAO.save(form);
		return form;
	}
	
	
	
	@RequestMapping(value="/updatestudent", method = RequestMethod.PUT)
	public Student updateStudent(@RequestParam(value="id", required=true) Integer id, @RequestParam(value="username", required=true) String username, @RequestParam(value="password", required=true) String password, @RequestParam(value="fullname", required=true) String fullname, @RequestParam(value="fathername", required=true) String fathername, @RequestParam(value="mothername", required=true) String mothername, @RequestParam(value="phone", required=true) Integer phone, @RequestParam(value="status", required=true) String status, @RequestParam(value="year", required=true) Integer year, @RequestParam(value="grades", required=true) Integer grades, @RequestParam(value="lessons", required=true) Integer lessons) {
		Student student = new Student (id, username, password, fullname, fathername, mothername, phone, status, year, grades, lessons);
		studentDAO.update(student);
		return student;
	}

	
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<?> deleteStudent(@PathVariable("id") int id) {
		studentDAO.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	

	
	
	
}
