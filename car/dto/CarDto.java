package com.xworkz.car.dto;

public class CarDto {
	
	private String brand;
	private int price;
	private String colour;
	private String type;
	private int speed;
	
	
	public CarDto() {
		System.out.println("Default constructor of cardto");
	}
	
	
	public CarDto(String brand, int price, String colour, String type, int speed) {
		super();
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		this.type = type;
		this.speed = speed;
	}





	public String getBrand() {
		return brand;
	}





	public void setBrand(String brand) {
		this.brand = brand;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public String getColour() {
		return colour;
	}





	public void setColour(String colour) {
		this.colour = colour;
	}





	public String getType() {
		return type;
	}





	public void setType(String type) {
		this.type = type;
	}





	public int getSpeed() {
		return speed;
	}





	public void setSpeed(int speed) {
		this.speed = speed;
	}





	@Override
	public String toString() {
		return "CarDto [brand=" + brand + ", price=" + price + ", colour=" + colour + ", type=" + type + ", speed="
				+ speed + "]";
	}
	
	
	

}
