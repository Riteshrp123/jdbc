package com.xworkz.television.dto;

public class TelevisionDto {
	
	private String brandName;
	private int price;
	private int screenSize;
	private String colour;
	private String type;
	
	
	public TelevisionDto() {
		System.out.println("Default consrtuctor of televion");
	}
	

	public TelevisionDto(String brandName, int price, int screenSize, String colour, String type) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.screenSize = screenSize;
		this.colour = colour;
		this.type = type;
	}



	public String getBrandName() {
		return brandName;
	}





	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}





	public int getPrice() {
		return price;
	}





	public void setPrice(int price) {
		this.price = price;
	}





	public int getScreenSize() {
		return screenSize;
	}





	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
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





	@Override
	public String toString() {
		return "TelevisionDto [brandName=" + brandName + ", price=" + price + ", screenSize=" + screenSize + ", colour="
				+ colour + ", type=" + type + "]";
	}
	
	
	

}
