package com.cardealership.entity;

import java.time.LocalDate;

/**
 * Represents a car which is located in a car dealership
 * 
 * @author Saunders
 * @version 1.0
 */
public class Car {
	private int year;
	private String make;
	private String model;
	private String color;
	private double price;
	private double vin;
	private double mileage;
	private LocalDate purchaseDate;
	private String description;
	public String carPics;
	private LocalDate purchasedate;
	
	public Car() {
		
	}
	
	public Car(int year, String make, String model, String color, double price, double vin, double mileage,
			LocalDate purchaseDate, String description, String carPics, LocalDate purchasedate2) {
		super();
		this.year = year;
		this.make = make;
		this.model = model;
		this.color = color;
		this.price = price;
		this.vin = vin;
		this.mileage = mileage;
		this.purchaseDate = purchaseDate;
		this.description = description;
		this.carPics = carPics;
		purchasedate = purchasedate2;
	}
	


public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public double getVin() {
	return vin;
}

public void setVin(double vin) {
	this.vin = vin;
}

public double getMileage() {
	return mileage;
}

public void setMileage(double mileage) {
	this.mileage = mileage;
}

public LocalDate getPurchaseDate() {
	return purchaseDate;
}

public void setPurchaseDate(LocalDate purchaseDate) {
	this.purchaseDate = purchaseDate;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getCarPics() {
	return carPics;
}

public void setCarPics(String carPics) {
	this.carPics = carPics;
}

public LocalDate getPurchasedate() {
	return purchasedate;
}

public void setPurchasedate(LocalDate purchasedate) {
	this.purchasedate = purchasedate;
}

@Override
public String toString() {
	return "Car [year=" + year + ", make=" + make + ", model=" + model + ", color=" + color + ", price=" + price
			+ ", vin=" + vin + ", mileage=" + mileage + ", purchaseDate=" + purchaseDate + ", description="
			+ description + ", carPics=" + carPics + "]";
    }
}
