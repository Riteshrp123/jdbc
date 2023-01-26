package com.xworkz.cake;

import java.util.List;

import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.service.CakeService;
import com.xworkz.cake.service.CakeServiceImpl;

public class CakeTester {
	
	public static void main(String[] args) {
		
		CakeService service = new CakeServiceImpl();
		
		CakeDto dto = new CakeDto(1, "Butter Scotch", "yellow", 600, "Veg");
		CakeDto dto1 = new CakeDto(2, "Vanila", "White", 500, "Non-Veg");
		CakeDto dto2 = new CakeDto(3, "Black forest", "Black", 700, "Veg");
		CakeDto dto3 = new CakeDto(4, "Red Velvet", "Red", 400, "Veg");
		CakeDto dto4 = new CakeDto(5, "Chocolate", "Black", 300, "Veg");
		CakeDto dto5 = new CakeDto(6, "Ice Cream", "Pink", 200, "Veg");
		CakeDto dto6 = new CakeDto(7, "Sponge", "Orange", 100, "Veg");
		CakeDto dto7 = new CakeDto(8, "Carrot", "Yellow", 350, "Veg");
		CakeDto dto8 = new CakeDto(9, "Pistachio", "White yellow", 450, "Veg");
		CakeDto dto9 = new CakeDto(10, "Cookie", "Black", 250, "Veg");
		
		 service.save(dto);
		 service.save(dto1);
		 service.save(dto2);
		 service.save(dto3);
		 service.save(dto4);
		 service.save(dto5);
		 service.save(dto6);
		 service.save(dto7);
		 service.save(dto8);
		 service.save(dto9);
		 
		System.out.println(service.findById(4));
		System.out.println(service.updateNameById("Pista", 9));
	    System.out.println(service.deleteById(8));
	    List<CakeDto> list=	service.readAll();
	    for(CakeDto l1:list) {
		System.out.println(l1);
	}
		}

}
