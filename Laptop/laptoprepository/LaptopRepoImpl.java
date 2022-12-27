package com.xworkz.laptoprepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo{
	
      List<LaptopDto> list = new ArrayList<LaptopDto>();
     
	@Override
	public boolean save(LaptopDto laptopdto) {
		list.add(laptopdto);
		System.out.println("Laptop data is saved");
		return true;
	}

	@Override
	public List<LaptopDto> read() {
		System.out.println("Laptop data is read");
		return list;
	}
	@Override
	public  List<LaptopDto> findByName(String name) {
		System.out.println("Data is found");
		return list;
	
}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return true;
	}

	@Override
	public boolean updateNameByIndex(int Index, String name) {
		LaptopDto data = list.get(Index);
		data.setName(name);
		System.out.println("Data is updated");
		list.set(Index, data);
		return true;
	}
}