package com.xworkz.car;

import java.util.List;

import com.xworkz.car.dto.CarDto;
import com.xworkz.car.service.CarService;
import com.xworkz.car.service.CarServiceImpl;

public class CarRunner {
	
	public static void main(String[] args) {
		
		CarService service = new CarServiceImpl();
		
		CarDto dto = new CarDto("Mercedes",9000000,"Black","Automatic",200);
		CarDto dto1 = new CarDto("Toyota",5000000,"White","Automatic",100);
		CarDto dto2 = new CarDto("Mahindra",2000000,"Red","Electric",120);
		CarDto dto3 = new CarDto("Honda",1000000,"Silver","Mannual",80);
		CarDto dto4 = new CarDto("Jaguar",7000000,"Black","Automatic",250);
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List <CarDto> data = service.read();
		System.out.println(data);
	    System.out.println(service.findByBrand("Honda"));
		System.out.println(service.updateColourByIndex(2, "Green"));
		System.out.println(service.updateSpeedByBrand("Honda", 110));
		System.out.println(service.updatePriceBytype("Electric", 3000000));
		service.deleteByIndex(2);
		service.deleteByBrandAndColour("Honda", "Silver");
		for(CarDto dtos : data)
		System.out.println(dtos);
	}

}
