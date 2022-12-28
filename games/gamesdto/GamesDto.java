package com.xworkz.games.gamesdto;

public class GamesDto {
	
	private String g_name;
	private int size;
	private int price;
	private String type;
	private String playIn;
	private boolean needGraphicsCard;

	public GamesDto() {
		System.out.println("Default constructor");
		
	}

	public GamesDto(String g_name, int size, int price, String type, String playIn, boolean needGraphicsCard) {
		super();
		this.g_name = g_name;
		this.size = size;
		this.price = price;
		this.type = type;
		this.playIn = playIn;
		this.needGraphicsCard = needGraphicsCard;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlayIn() {
		return playIn;
	}

	public void setPlayIn(String playIn) {
		this.playIn = playIn;
	}

	public boolean isNeedGraphicsCard() {
		return needGraphicsCard;
	}

	public void setNeedGraphicsCard(boolean needGraphicsCard) {
		this.needGraphicsCard = needGraphicsCard;
	}

	@Override
	public String toString() {
		return "GamesDto [g_name=" + g_name + ", size=" + size + ", price=" + price + ", type=" + type + ", playIn="
				+ playIn + ", needGraphicsCard=" + needGraphicsCard + "]";
	}
	
}
