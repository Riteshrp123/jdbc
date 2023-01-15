package com.xworkz.freez.service;

import java.util.List;

import com.xworkz.freez.dto.FreezDto;

public interface FreezService {
	
	public boolean saveAll(FreezDto dto);
	
	public List<FreezDto> read();

}
