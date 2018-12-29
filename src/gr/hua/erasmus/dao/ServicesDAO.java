package gr.hua.erasmus.dao;

import java.util.List;

import gr.hua.erasmus.entities.Services;

public interface ServicesDAO {

	
	public void save(Services serv);
		
	public void update(Services serv);
	
	public void delete(String user_services);
	
	public List<Services> getAll();

}
