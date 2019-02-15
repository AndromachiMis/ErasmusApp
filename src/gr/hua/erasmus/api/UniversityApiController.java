package gr.hua.erasmus.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import gr.hua.erasmus.dao.UniversitiesDAO;
import gr.hua.erasmus.entities.Student;
import gr.hua.erasmus.entities.Universities;


@RestController
@RequestMapping("/api/universities")
public class UniversityApiController {
	@Autowired
	private UniversitiesDAO universitiesDAO;
	
	@GetMapping("/getuniversities")
	public List<Universities> getAll(){
		List<Universities> university = universitiesDAO.getAll();
		return university;		
	}
	@GetMapping("/universities/{universityId}")
	public Universities getUniversity(@PathVariable int universityId) {
		Universities theUniversity = universitiesDAO.getById(universityId);
		if (theUniversity==null) {
			try {
				throw new Exception("University id not found" + universityId);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return theUniversity;
	}	
	
	
	@PostMapping("/adduniversity")
	public Universities addUniversity(@RequestParam String name, @RequestParam String location, @RequestParam Integer num_acceptants)  {
		Universities university=new Universities(name, location, num_acceptants);
		universitiesDAO.save(university);
		return university;
	}
	
	@RequestMapping(value="/updateuniversity", method= RequestMethod.PUT)
	public Universities updateUniversity(@RequestParam Universities university) {
		universitiesDAO.update(university);
		return university;
	}
	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/delete/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<?> deleteUniversity(@PathVariable("id") int id) {
		universitiesDAO.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	

}
