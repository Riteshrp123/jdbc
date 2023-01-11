package com.xworkz.soap;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class SoapRunner {

	public static void main(String[] args) {

		SoapRepo repo = new SoapRepoImpl();

		SoapDto dto = new SoapDto(1, "Margo", 50, "Green", "Neem", 100, 10 / 04, "Body Wash");
		SoapDto dto1 = new SoapDto(2, "Lux", 40, "White", "White rose", 120, 11 / 05, "Body Wash");
		SoapDto dto2 = new SoapDto(3, "Tide", 30, "White Blue", "Lemon", 110, 23 / 04, "Cloth Wash");
		SoapDto dto3 = new SoapDto(4, "Lizal", 40, "Yellow", "Lemon", 130, 30 / 04, "Floor Wash");
		SoapDto dto4 = new SoapDto(5, "Dettol", 60, "Green", "pine", 80, 10 / 06, "Body Wash");
		SoapDto dto5 = new SoapDto(6, "Helio", 30, "Blue", "Good", 70, 10 / 07, "Shose Wash");
		SoapDto dto6 = new SoapDto(7, "Pears", 90, "Orange", "Glycerin", 140, 10 / 04, "Body Wash");
		SoapDto dto7 = new SoapDto(8, "Surf excel", 20, "blue", "bleach", 200, 29 / 04, "Cloth Wash");
		SoapDto dto8 = new SoapDto(9, "Dove", 150, "White", "Milky", 108, 18 / 04, "Body Wash");
		SoapDto dto9 = new SoapDto(10, "Cinthol", 50, "Pink", "Rose", 107, 19 / 04, "Body Wash");

//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
//		

		List<SoapDto> list = repo.read();
//		for (SoapDto dtos : list) {
//			System.out.println(dtos);
//		}
//		System.out.println(repo.findByNameAndPrice("Pears", 90));
		// System.out.println(repo.updateColorAndFreagranceByName("Black", "lilly",
		// "Cinthol"));
		// repo.updateNamebyPrice("Life boy", 150);
		repo.upadateTypeById("Body soap", 10);
		for (SoapDto dtos : list) {
			System.out.println(dtos);
		}
		// System.out.println(dtos);

	}

}
