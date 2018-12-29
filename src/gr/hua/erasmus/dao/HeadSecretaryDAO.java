package gr.hua.erasmus.dao;

import java.util.List;

import gr.hua.erasmus.entities.HeadSecretary;

public interface HeadSecretaryDAO {
	
	public void update(HeadSecretary headsec);
			
	public List<HeadSecretary> getHeadSecretary();
	

}


