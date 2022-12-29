package com.xworkz.car.service;

import java.util.List;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.repo.CarRepo;
import com.xworkz.car.repo.CarRepoImpl;

public class CarServiceImpl implements CarService {
	
	CarRepo repo = new CarRepoImpl();

	@Override
	public boolean save(CarDto dto) {
		if(dto!=null && dto.getBrand().length()>=4)
			System.out.println("Data is saved and send to repo");
			repo.save(dto);
		return true;
	}

	@Override
	public List<CarDto> read() {
		System.out.println("All data read and send to repo");
		return repo.read();
	}

	@Override
	public CarDto findByBrand(String brand) {
		if(brand!=null && brand.length()>=3);
		System.out.println("Data is valid and send it to repo");
		List<CarDto> dtos = repo.read();	
		for(CarDto data : dtos) {
			if(data.getBrand().equals(brand)) {
				return data;
			}
		}
		return null;
	}

	@Override
	public boolean updateColourByIndex(int index, String colour) {
		if(colour!=null && colour.length()>=3)
			if(index>=0)
				System.out.println("Data is valid and send for check");
		
		return repo.updateColourByIndex(index, colour);
	}

	@Override
	public boolean updateSpeedByBrand(String brand, int speed) {
		if(brand!=null && brand.length()>=3)
			if(speed>50)
				System.out.println();
		return repo.updateSpeedByBrand(brand, speed); 
	}

	@Override
	public boolean updatePriceBytype(String type, int price) {
		if(type!=null && type.length()>=3)
			if(price>=10000000)
				System.out.println("");
		return repo.updatePriceByType(type, price);
	}

	@Override
	public boolean deleteByIndex(int index) {
		if(index>=0)
			System.out.println("Data is verified and go for delete");
		return repo.deleteByIndex(index);
	}

	@Override
	public boolean deleteByBrandAndColour(String brand, String colour) {
		if(brand!=null && brand.length()>=3)
			if(colour!=null && colour.length()>=3)
				System.out.println("Data is validated");
		return repo.deleteByBrandAndColour(brand, colour);
	}

}
