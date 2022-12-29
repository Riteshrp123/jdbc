package com.xworkz.car.service;

import java.util.List;

import com.xworkz.car.dto.CarDto;

public interface CarService {
	
	public boolean save(CarDto dto);
	
	public List<CarDto> read();
	
	public CarDto findByBrand(String brand);
	
	public boolean updateColourByIndex(int index,String colour);
	
	public boolean updateSpeedByBrand(String brand,int speed);
	
	public boolean updatePriceBytype(String type,int price);
	
	public boolean deleteByIndex(int index);
	
	public boolean deleteByBrandAndColour(String brand,String colour);
	
	

}
