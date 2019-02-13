package gr.hua.erasmus.dao;

import java.util.List;

import gr.hua.erasmus.entities.Universities;


public interface UniversitiesDAO {
	
	public void save (Universities university);
	
	public Universities getById(int id);

	public void update(Universities university);
	
	public void deleteById(int id);
	
	public List<Universities> getAll();
}

