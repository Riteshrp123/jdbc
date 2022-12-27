package com.xworkz.laptopservice;

import java.util.List;

import com.xworkz.laptop.LaptopDto;

public interface LaptopService {

	public boolean save(LaptopDto laptop);
	
	public List<LaptopDto> read();
	
	public LaptopDto findByName(String name);
	
	public boolean deletByIndex(int index);
	
	public boolean updateNameByIndex(int Index,String name);

		
}
