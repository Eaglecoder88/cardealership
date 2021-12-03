package com.cardealership.entity;

public class Customer {
	private String firstName;
	private String lastName;
	private String infoDB;
	private String email;
	private String jobTitle;
	private String password;
	private int phoneHome;
	private int phoneCellular;
	private Address address;
	
	public Customer () {
		
	}
	
	public Customer(String firstName, String lastName, String infoDB, String email, String jobTitle, String password,
			int phoneHome, int phoneCellular, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.infoDB = infoDB;
		this.email = email;
		this.jobTitle = jobTitle;
		this.password = password;
		this.phoneHome = phoneHome;
		this.phoneCellular = phoneCellular;
		this.address = address;
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
	public int getPhoneHome() {
		return phoneHome;
	}
	public void setPhoneHome(int phoneHome) {
		this.phoneHome = phoneHome;
	}
	public int getPhoneCellular() {
		return phoneCellular;
	}
	public void setPhoneCellular(int phoneCellular) {
		this.phoneCellular = phoneCellular;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", infoDB=" + infoDB + ", email=" + email
				+ ", jobTitle=" + jobTitle + ", password=" + password + ", phoneHome=" + phoneHome + ", phoneCellular="
				+ phoneCellular + ", address=" + address + "]";
	}
		
}
