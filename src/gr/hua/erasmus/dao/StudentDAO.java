package gr.hua.erasmus.dao;

import java.util.List;

import gr.hua.erasmus.entities.Student;

public interface StudentDAO {

	public void save(Student student);
	
	public Student getById(int id);
	
	public void update(Student student);
	
	public void deleteById(int id);
	
	public List<Student> getAll();
}



