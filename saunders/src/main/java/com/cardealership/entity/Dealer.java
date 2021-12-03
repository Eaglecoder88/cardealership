package com.cardealership.entity;

public class Dealer {
	private String firstName;
	private String lastName;
	private String nameCompany;
	private String email;
	private String jobTitle;
	private String password;
	private int phoneNumber;
	private int numberCellular;
	private Address address;
	
	public Dealer() {
		
	}
	
	public Dealer(String firstName, String lastName, String nameCompany, String email, String jobTitle, String password,
			int phoneNumber, int numberCellular, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nameCompany = nameCompany;
		this.email = email;
		this.jobTitle = jobTitle;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.numberCellular = numberCellular;
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
	public String getNameCompany() {
		return nameCompany;
	}
	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
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
	public int getNumberCellular() {
		return numberCellular;
	}
	public void setNumberCellular(int numberCellular) {
		this.numberCellular = numberCellular;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Dealer [firstName=" + firstName + ", lastName=" + lastName + ", nameCompany=" + nameCompany + ", email="
				+ email + ", jobTitle=" + jobTitle + ", password=" + password + ", phoneNumber=" + phoneNumber
				+ ", numberCellular=" + numberCellular + ", address=" + address + "]";
	}
	
}
