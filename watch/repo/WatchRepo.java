package com.xworkz.watch.repo;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public interface WatchRepo {
	
	
	public boolean saveAll(WatchDto dto);
	
    public List<WatchDto> read();
    
    public WatchDto findByBrandNameAndColor(String brandName,String color);
    
    public WatchDto findByIdAndType(int id,String type);
    
    public boolean deleteByColorAndType(String color,String type);

	boolean updateBrandNameById(String brandaName, int id);
    
}
