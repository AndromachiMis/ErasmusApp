package gr.hua.erasmus.entities;

import java.io.Serializable;

public class Universities implements Serializable {
	private static final long serialVersionUID = 1505111959908078326L;

	private int id;
	private String name;
	private String location;
	private int num_acceptants;

	public Universities() {
		super();
	}

	public Universities(int id, String name, String location, int num_acceptants) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.num_acceptants = num_acceptants;
	}

	public Universities(String name, String location, int num_acceptants) {
		super();
		this.name = name;
		this.location = location;
		this.num_acceptants = num_acceptants;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}
