package gr.hua.erasmus.entities;

import java.io.Serializable;

public class Universities implements Serializable {
	private static final long serialVersionUID = 1505111959908078326L;

	private String id;
	private String name;
	private String location;
	private int num_acceptants;
	private int student_id;

	public Universities() {
		super();
	}

	public Universities(String name, String id, String location, int num_acceptants, int student_id) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		this.num_acceptants = num_acceptants;
		this.student_id = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNum_acceptants() {
		return num_acceptants;
	}

	public void setNum_acceptants(int num_acceptants) {
		this.num_acceptants = num_acceptants;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
}
