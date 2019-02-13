package gr.hua.erasmus.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gr.hua.erasmus.dao.UniversitiesDAO;
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
	
	@PostMapping("/adduniversity")
	public Universities addUniversity(@RequestBody Universities theUniversity) {
		universitiesDAO.save(theUniversity);
		return theUniversity;
	}
	

}
