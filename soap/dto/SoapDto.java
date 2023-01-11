package com.xworkz.soap.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoapDto {

	private int id;
	private String name;
	private int price;
	private String color;
	private String freagrance;
	private int weight;
	private int manufactureDate;
	private String type;
	
	
}
