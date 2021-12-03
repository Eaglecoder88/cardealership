package com.cardealership.entity;

public class Employee {
	private String firstName;
	private String lastName;
	private String infoDB;
	private String email;
	private String jobTitle;
	private String password;
	private int phoneNumber;
	private int phoneDesk;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String infoDB, String email, String jobTitle, String password,
			int phoneNumber, int phoneDesk) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.infoDB = infoDB;
		this.email = email;
		this.jobTitle = jobTitle;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.phoneDesk = phoneDesk;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getInfoDB() {
		return infoDB;
	}
	public void setInfoDB(String infoDB) {
		this.infoDB = infoDB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getPhoneDesk() {
		return phoneDesk;
	}
	public void setPhoneDesk(int phoneDesk) {
		this.phoneDesk = phoneDesk;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", infoDB=" + infoDB + ", email=" + email
				+ ", jobTitle=" + jobTitle + ", password=" + password + ", phoneNumber=" + phoneNumber + ", phoneDesk="
				+ phoneDesk + "]";
	}
	
	
}
