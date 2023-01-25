package com.xworkx.biscuit.dto;

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
@Table(name="biscuit")
public class BiscuitDto {
	
	@Id
	private int id;
	private String name;
	private int price;
	private String type;
	private int noOfBiscuit;
	

}
