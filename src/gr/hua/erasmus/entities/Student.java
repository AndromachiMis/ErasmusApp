package gr.hua.erasmus.entities;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 3502277722733264638L;

	private int id;
	private String username;
	private String password;
	private String fullname;
	private String fathername;
	private String mothername;
	private int phone;
	private String status;
	private String year;
	private int grades;
	private int lessons;
	private String collabuni;

	public Student() {
		super();
	}

	public Student(int id, String username, String password, String fullname, String fathername, String mothername, 
			int phone, String status, String year, int grades, int lessons) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.phone = phone;
		this.status = status;
		this.year = year;
		this.grades = grades;
		this.lessons = lessons;
	}
	
	
	public Student(String username, String password, String fullname, String fathername, String mothername, 
			int phone, String status, String year, int grades, int lessons) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.phone = phone;
		this.status = status;
		this.year = year;
		this.grades = grades;
		this.lessons = lessons;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}


	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}

	public int getLessons() {
		return lessons;
	}

	public void setLessons(int lessons) {
		this.lessons = lessons;
	}

	public String getCollabuni() {
		return collabuni;
	}

	public void setCollabuni(String collabuni) {
		this.collabuni = collabuni;
	}
}
