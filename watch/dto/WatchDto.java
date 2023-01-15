package com.xworkz.watch.dto;

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
public class WatchDto {
	
	private int id;
	private String brandName;
	private String color;
	private String type;
	private int price;
	

}
