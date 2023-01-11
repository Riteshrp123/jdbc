package com.xworkz.bag.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BagDto {
	
	private int id;
	private String brandName;
	private String color;
	private int capacity;
	private int price;

}



