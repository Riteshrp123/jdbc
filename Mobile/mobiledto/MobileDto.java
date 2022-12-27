package com.xworkz.mobile.mobiledto;


public class MobileDto {
	
	private String name;
	private String colour;
	private int price;
	private String manufactureIn;
	private boolean camera;
	private int ram;
	
	
public MobileDto() {
	System.out.println("Default constructor");
	
}


public MobileDto(String name, String colour, int price, String manufactureIn, boolean camera, int ram) {
	super();
	this.name = name;
	this.colour = colour;
	this.price = price;
	this.manufactureIn = manufactureIn;
	this.camera = camera;
	this.ram = ram;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getColour() {
	return colour;
}


public void setColour(String colour) {
	this.colour = colour;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public String getManufactureIn() {
	return manufactureIn;
}


public void setManufactureIn(String manufactureIn) {
	this.manufactureIn = manufactureIn;
}


public boolean isCamera() {
	return camera;
}


public void setCamera(boolean camera) {
	this.camera = camera;
}


public int getRam() {
	return ram;
}


public void setRam(int ram) {
	this.ram = ram;
}


@Override
public String toString() {
	return "MobileDto [name=" + name + ", colour=" + colour + ", price=" + price + ", manufactureIn=" + manufactureIn
			+ ", camera=" + camera + ", ram=" + ram + "]";
}


}
