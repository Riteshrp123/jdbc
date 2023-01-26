package com.xworkz.carrom.service;

import com.xworkz.carrom.dto.CarromDto;

public interface CarromService {
	
	public boolean save(CarromDto dto);
	
	public CarromDto findById(int id);
	
	public boolean updateBrandNameById(String brandname,int id);
	
	public boolean deleteByid(int id);

}
