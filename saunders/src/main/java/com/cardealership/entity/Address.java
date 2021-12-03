package com.cardealership.entity;

public class Address {
	public String streetInfo;
	public String city;
	public String state;
	public int zipCode;
	
	public Address() {
		
	}
	
	public Address(String streetIinfo, String city, String state, int zipCode) {;
	this.streetInfo = streetIinfo;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
}
	
	public String getStreetIinfo() {
		return streetInfo;
	}
	public void setStreetIinfo(String streetIinfo) {
		this.streetInfo = streetIinfo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Address [streetInfo=" + streetInfo + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
				+ "]";
	}
	

}
