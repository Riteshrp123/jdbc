package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevionService {
	
	public boolean save(TelevisionDto dto);
	
    public List<TelevisionDto> read();
    
    public TelevisionDto findByBrandNameAndSize(String brandName,int size);
    
    public TelevisionDto findTypeAndColourByIndex(int index);
    
    public boolean updateByTypeAndSize(String type,int size);
    
    public boolean updateSizeByType(int size,String type);
    
    public boolean DeleteBYnameAndColour(String name,String colour);
    
    
}
