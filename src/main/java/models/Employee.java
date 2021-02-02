package models;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String gender;
	private String address;
	
	
	public Employee(String name, String email, String gender, String address) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
	}

	
	public Employee(int id, String name, String email, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", address="
				+ address + "]";
	}
	
	
	
}
