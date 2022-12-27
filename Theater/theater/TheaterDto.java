package com.xworkz.theater;

public class TheaterDto {
	
	private String name;
	private String location;
	private int noOfScreen;
	private String type;
	private boolean serveAnyFood;
	private int ticketPrice;
	private boolean parking;
	private boolean lift;
	private int noOfSeat;
	private int noOfGate;
	
	public TheaterDto() {
		System.out.println("Default constructor of theater");
	}
	
	
	
	public TheaterDto(String name, String location, int noOfScreen, String type, boolean serveAnyFood, int ticketPrice,
			boolean parking, boolean lift, int noOfSeat, int noOfGate) {
		super();
		System.out.println("Data come to repo by parameter constructor");
		this.name = name;
		this.location = location;
		this.noOfScreen = noOfScreen;
		this.type = type;
		this.serveAnyFood = serveAnyFood;
		this.ticketPrice = ticketPrice;
		this.parking = parking;
		this.lift = lift;
		this.noOfSeat = noOfSeat;
		this.noOfGate = noOfGate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public int getNoOfScreen() {
		return noOfScreen;
	}



	public void setNoOfScreen(int noOfScreen) {
		this.noOfScreen = noOfScreen;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public boolean isServeAnyFood() {
		return serveAnyFood;
	}



	public void setServeAnyFood(boolean serveAnyFood) {
		this.serveAnyFood = serveAnyFood;
	}



	public int getTicketPrice() {
		return ticketPrice;
	}



	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}



	public boolean isParking() {
		return parking;
	}



	public void setParking(boolean parking) {
		this.parking = parking;
	}



	public boolean isLift() {
		return lift;
	}



	public void setLift(boolean lift) {
		this.lift = lift;
	}



	public int getNoOfSeat() {
		return noOfSeat;
	}



	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}



	public int getNoOfGate() {
		return noOfGate;
	}



	public void setNoOfGate(int noOfGate) {
		this.noOfGate = noOfGate;
	}



	@Override
	public String toString() {
		return "TheaterDto [name=" + name + ", location=" + location + ", noOfScreen=" + noOfScreen + ", type=" + type
				+ ", serveAnyFood=" + serveAnyFood + ", ticketPrice=" + ticketPrice + ", parking=" + parking + ", lift="
				+ lift + ", noOfSeat=" + noOfSeat + ", noOfGate=" + noOfGate + "]";
	}
		
	}
	
	
