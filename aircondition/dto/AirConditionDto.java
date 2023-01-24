package com.xworkz.aircondition.dto;

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
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="aircondition")
public class AirConditionDto {
	
	@Id
	private int id;
	private String brand;
	private int price;
	private int rating;
	private String type;
	

}
