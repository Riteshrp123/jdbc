package com.xworkx.shirt.dto;

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
public class ShirtDto {
	
	private int id;
	private String brandName;
	private String color;
	private int size;
	private boolean hasPacket;

}
