package com.xworkz.freez.repo;

import java.util.List;

import com.xworkz.freez.dto.FreezDto;

public interface FreezRepo {
	
	public boolean saveAll(FreezDto dto);
	
	public List<FreezDto> read();
	

}
