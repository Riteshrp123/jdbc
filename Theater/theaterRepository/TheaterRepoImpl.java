package com.xworkz.theaterRepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.TheaterDto;

public class TheaterRepoImpl implements TheaterRepo{
	
	List<TheaterDto> list = new ArrayList<TheaterDto>();

	
	@Override
	public boolean save(TheaterDto theaterdto) {
		System.out.println("Theater repo will came to database");
	      list.add(theaterdto);
		System.out.println("Theater data will be save");
		return true;
	
	}

	@Override
	public List<TheaterDto> read() {
	     return list;
	}

	public  List<TheaterDto> findByName(String name){
		System.out.println("Theater name is there");
			return list;
	
}
	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return true;
	}

	@Override
	public boolean updateNameByIndex(int index, String name) { {
	  TheaterDto returedDto = list.get(index);
	  returedDto.setName(name);
	  System.out.println("Data is update succesfull");
	  list.set(index, returedDto);
		return true;
}
}
}