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
import gr.hua.erasmus.entities.Student;
import gr.hua.erasmus.entities.Universities;


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
	
	@RequestMapping(value="/addstudent", method=RequestMethod.POST)	
	public Student addStudent(@RequestParam(required=false, name="username") String username, @RequestParam(required=false, name="password") String password, @RequestParam(required=false, name="fullname") String fullname, @RequestParam (required=false, name="fathername") String fathername, @RequestParam (required=false, name="mothername") String mothername, @RequestParam (required=false, name="phone") Integer phone, @RequestParam (required=false, name="status") String status, @RequestParam (required=false, name="year") Integer year, @RequestParam (required=false, name="grades") Integer grades, @RequestParam (required=false, name="lessons") Integer lessons) {
	Student student = new Student (username, password,fullname,fathername,mothername,phone,status,year,grades,lessons);
	studentDAO.save(student);
	return student;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<?> deleteStudent(@PathVariable("id") int id) {
		studentDAO.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	

	
	
	
}
