package main.java.gr.hua.erasmus.dao;

import java.util.List;

import main.java.gr.hua.erasmus.entities.HeadSecretary;

public interface HeadSecretaryDAO {
		
	public List<HeadSecretary> getHeadSecretary();
	
	public boolean isHeadSecretary(String username, String password);
}


