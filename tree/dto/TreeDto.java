package com.xworkz.tree.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TreeDto {
	
	
	private int id;
	private String name;
	private String color;
	private String type;
	private boolean giveFood;
	

}
