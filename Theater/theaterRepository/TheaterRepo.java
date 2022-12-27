package com.xworkz.theaterRepository;


import java.util.List;

import com.xworkz.theater.TheaterDto;

public interface TheaterRepo {
	

	public boolean save(TheaterDto theaterDto);
	
	public List<TheaterDto> read();  

	public boolean deleteByIndex(int index);

	public List<TheaterDto> findByName(String name);
	
	public boolean updateNameByIndex(int index,String name);
	
	
	}