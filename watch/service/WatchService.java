package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {
	
	
	public boolean saveAll(WatchDto dto);
	
    public List<WatchDto> read();
    
    public WatchDto findByBrandNameAndColor(String brandName,String color);
    
    public WatchDto findByIdAndType(int id,String type);
    
    public boolean updateBrandNameById(String brandName,int id);
    
    public boolean deleteByColorAndType(String color,String type);
    
    
}
