package com.xworkz.laptop;



public class LaptopDto {
	
	private String name;
	private int price;
	private String colour;
	private int rom;
	private int ram;
	private boolean wifi;
	private boolean bluetooth;
	private int screenSize;
	private int battryCapacity;
	private boolean camera;
	
	public LaptopDto() {
		System.out.println("Default constructor data");
	}

	

	public LaptopDto(String name, int price, String colour, int rom, int ram, boolean wifi, boolean bluetooth,
			int screenSize, int battryCapacity, boolean camera) {
		super();
		this.name = name;
		this.price = price;
		this.colour = colour;
		this.rom = rom;
		this.ram = ram;
		this.wifi = wifi;
		this.bluetooth = bluetooth;
		this.screenSize = screenSize;
		this.battryCapacity = battryCapacity;
		this.camera = camera;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
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



	public int getRom() {
		return rom;
	}



	public void setRom(int rom) {
		this.rom = rom;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public boolean isWifi() {
		return wifi;
	}



	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}



	public boolean isBluetooth() {
		return bluetooth;
	}



	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}



	public int getScreenSize() {
		return screenSize;
	}



	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}



	public int getBattryCapacity() {
		return battryCapacity;
	}



	public void setBattryCapacity(int battryCapacity) {
		this.battryCapacity = battryCapacity;
	}



	public boolean isCamera() {
		return camera;
	}



	public void setCamera(boolean camera) {
		this.camera = camera;
	}



	@Override
	public String toString() {
		return "LaptopDto [name=" + name + ", price=" + price + ", colour=" + colour + ", rom=" + rom + ", ram=" + ram
				+ ", wifi=" + wifi + ", bluetooth=" + bluetooth + ", screenSize=" + screenSize + ", battryCapacity="
				+ battryCapacity + ", camera=" + camera + "]";
	}

	}
	
