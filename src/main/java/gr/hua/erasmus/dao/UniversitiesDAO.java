package main.java.gr.hua.erasmus.dao;

import java.util.List;

import main.java.gr.hua.erasmus.entities.Universities;


public interface UniversitiesDAO {
	
	
	public void save (Universities university);
	
	public Universities getById(String id);

	public void update(Universities university);
	
	public void deleteById(String id);
	
	public List<Universities> getAll();
}

