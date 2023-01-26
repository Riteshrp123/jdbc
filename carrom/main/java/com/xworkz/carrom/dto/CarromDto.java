package com.xworkz.carrom.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name="carrom")

public class CarromDto {
	
	@Id
	private int id;
	private String brandName;
	private String madeIn;
	private int noOfDot;
	private int noOfPlayer;
	

}
