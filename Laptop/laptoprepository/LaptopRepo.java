package com.xworkz.laptoprepository;

import java.util.List;

import com.xworkz.laptop.LaptopDto;

public interface LaptopRepo {
	
	public boolean save(LaptopDto laptopdto);

	public List<LaptopDto> read();
	
	public List<LaptopDto> findByName(String name);
	
	public boolean deleteByIndex(int index);

	public boolean updateNameByIndex(int Index,String name);
	

}
