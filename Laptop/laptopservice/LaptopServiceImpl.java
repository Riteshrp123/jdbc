package com.xworkz.laptopservice;

import java.util.List;

import com.xworkz.laptop.LaptopDto;
import com.xworkz.laptoprepository.LaptopRepo;
import com.xworkz.laptoprepository.LaptopRepoImpl;

public class LaptopServiceImpl implements LaptopService{

	LaptopRepo repo = new LaptopRepoImpl();
	
	@Override
	public boolean save(LaptopDto laptop) {
		if(laptop!=null) {
			if(laptop.getName().length()>=4) {
				System.out.println("Laptop data is saved in repository");
				repo.save(laptop);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<LaptopDto> read() {
		System.out.println("All data of laptop is read");
		return repo.read();
	}

	@Override
	public LaptopDto findByName(String name) {
		if(name!=null);
		if(name.length()>=3) {
			System.out.println("Laptop name found succesfully");
			List<LaptopDto> dtos =repo.findByName(name);
			for(LaptopDto dto : dtos) {
				if(dto.getName().equals(name)){ 
				return dto;	
				}
				}
		}
		return null;
	}
	@Override
	public boolean deletByIndex(int index) {
		if(index>=0) {
		System.out.println("Laptop name deleted");
		repo.deleteByIndex(index);
		return true;
		}
		return false;
	}

	@Override
	public boolean updateNameByIndex(int Index, String name) {
		if(name!=null && name.length()>=4)
			if(Index>=0) 
				System.out.println("Data updated by index");
				repo.updateNameByIndex(Index, name);
		return true;
	}
	
			}
