package com.xworkz.carrom.repo;

import com.xworkz.carrom.dto.CarromDto;

public interface CarromRepo {

    public boolean save(CarromDto dto);
	
	public CarromDto findById(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteByid(int id);

}
