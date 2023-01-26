package com.xworkz.cake.repo;

import java.util.List;

import com.xworkz.cake.dto.CakeDto;

public interface CakeRepo {
	

	public boolean save(CakeDto dto);
	
	public List<CakeDto> readAll();
	
	public CakeDto findById(int id);
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);

}
