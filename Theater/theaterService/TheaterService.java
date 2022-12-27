package com.xworkz.theaterService;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;

public interface TheaterService  {
    
	public boolean save(TheaterDto theaterdto);

	
	public TheaterDto findByName(String name);

	public List<TheaterDto> read();
	
	public boolean updateNameByindex(int index,String name);
	
	public boolean deleteByIndex(int index);

}
