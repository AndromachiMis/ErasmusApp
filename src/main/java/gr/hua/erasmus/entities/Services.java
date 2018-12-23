package main.java.gr.hua.erasmus.entities;

import java.io.Serializable;

public class Services implements Serializable {
	private static final long serialVersionUID = 842035841132810611L;

	private String user_services;
	private int headsecretary_id;
	private int student_id;

	public Services() {
		super();
	}

	public Services(String user_services, int headsecretary_id, int student_id) {
		super();
		this.user_services = user_services;
		this.headsecretary_id = headsecretary_id;
		this.student_id = student_id;
	}

	public String getUser_services() {
		return user_services;
	}

	public void setUser_services(String user_services) {
		this.user_services = user_services;
	}

	public int getHeadsecretary_id() {
		return headsecretary_id;
	}

	public void setHeadsecretary_id(int headsecretary_id) {
		this.headsecretary_id = headsecretary_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
}
