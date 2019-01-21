package gr.hua.erasmus.entities;

public class Form {
	
	private int id;
	private String username;
	private String fullname;
	private String fathername;
	private String mothername;
	private int phone;
	private int year;
	private int lessons;
	private String[] universities;
	private String cert;
	
	public Form(int id, String username, String fullname, String fathername, String mothername, int phone, int year,
			int lessons, String[] universities, String cert) {
		super();
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.phone = phone;
		this.year = year;
		this.lessons = lessons;
		this.universities = universities;
		this.cert = cert;
	}
	
	

	public Form(String username, String fullname, String fathername, String mothername, int phone, int year,
			int lessons, String[] universities, String cert) {
		super();
		this.username = username;
		this.fullname = fullname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.phone = phone;
		this.year = year;
		this.lessons = lessons;
		this.universities = universities;
		this.cert = cert;
	}

	public Form() {
		super();
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getLessons() {
		return lessons;
	}

	public void setLessons(int lessons) {
		this.lessons = lessons;
	}

	public String[] getUniversities() {
		return universities;
	}

	public void setUniversities(String[] universities) {
		this.universities = universities;
	}

	public String getCert() {
		return cert;
	}

	public void setCert(String cert) {
		this.cert = cert;
	}
}