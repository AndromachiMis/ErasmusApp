package gr.hua.erasmus.dao;

import java.util.List;

import gr.hua.erasmus.entities.HeadSecretary;

public interface HeadSecretaryDAO {
		
	public List<HeadSecretary> getHeadSecretary();
	
	public boolean isHeadSecretary(String username, String password);
}


