package com.xworkz.pencil.dto;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.AllArgsConstructor;


@Entity
@Table(name="pencil")
public class PencilDto {
	
	@Id
	private int id;
	private String brand;
	private int price;
	private String type;
	private  String work;

	
	public PencilDto() {
	}


	public PencilDto(int id, String brand, int price, String type, String work) {
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.work = work;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	@Override
	public String toString() {
		return "PencilDto [id=" + id + ", brand=" + brand + ", price=" + price + ", type=" + type + ", work=" + work
				+ "]";
	}
	
	

	
}
