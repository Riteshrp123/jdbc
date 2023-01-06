package com.xworkz.television.repo;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevionRepo {

	
	public boolean save(TelevisionDto dto);
	
	public List<TelevisionDto> read();
	
	public List<TelevisionDto> findByBrandNameAndSize(String brandName,int size);
	
	public List<TelevisionDto> findTypeAndColourByIndex(int index);
	
	public boolean updateByTypeAndSize(String type,int size);
	
	public boolean updateSizeByType(int size, String type);

	public boolean DeleteBYnameAndColour(String name,String colour);
	
}
