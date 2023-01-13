package com.xworkx.shirt.repo;

import java.util.List;

import com.xworkx.shirt.dto.ShirtDto;

public interface ShirtRepo {
	
	public boolean save(ShirtDto dto);
	
	public List<ShirtDto> read();
	
	public ShirtDto findByNameAndId(String name,int id);
	
	public boolean updateSizeByName(int size,String name);
	
	public boolean deletByColor(String color);
	
	public boolean deleteBySizeAndName(int size,String name);
	

}
