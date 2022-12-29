package com.xworkz.car.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.car.dto.CarDto;

public class CarRepoImpl implements CarRepo {
	
	List<CarDto> list = new ArrayList<CarDto>();

	@Override
	public boolean save(CarDto dto) {
		System.out.println("All data is saved succesfully");
		list.add(dto);
		return true;
	}

	@Override
	public List<CarDto> read() {
	   return list;
	}

	@Override
	public CarDto findByBrand(String brand) {
	    System.out.println("Car Brand is found Succesfully");
		return null;
	}

	@Override
	public boolean updateColourByIndex(int index, String colour) {
		for(int i =0 ;i<list.size();i++) {
			CarDto dto = list.get(i);
			if(index>=0){
				dto.setColour(colour);
				System.out.println("Data is updated by index");
				list.set(index, dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateSpeedByBrand(String brand, int speed) {
		for(int i = 0;i<list.size();i++) {
			CarDto dto = list.get(i);
			if(dto.getBrand().equals(brand)) {
				dto.setSpeed(speed);
				System.out.println("Data is valid and srvice send to repo");
				list.set(i, dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updatePriceByType(String type, int price) {
	for(int i = 0;i<list.size();i++) {
		CarDto dto = list.get(i);
		if(dto.getType().equals(type)){
			System.out.println("data is valid");	
			dto.setPrice(price);
			System.out.println("Price is valid go for upadation");
			list.set(i, dto);
			return true;
		}
	}
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data is delete succesfully");
		list.remove(index);
		return true;
	}

	@Override
	public boolean deleteByBrandAndColour(String Brand, String colour) {
		Iterator<CarDto> itr = list.iterator();
		while(itr.hasNext()) {
			CarDto data = itr.next();
			if(data.getBrand().equals(Brand) && data.getColour().equals(colour)) {
				System.out.println("Data is delete succesfully");
				list.remove(data);
				return true;
	}

		}
		return false;
	}
}
