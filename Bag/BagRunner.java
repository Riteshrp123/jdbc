package com.xworkz.bag;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.repo.BagRepo;
import com.xworkz.bag.repo.BagRepoImpl;

public class BagRunner {
	
	public static void main(String[] args) {
		
		BagRepo repo = new BagRepoImpl();
		
		BagDto dto = new BagDto(1, "Puma", "Black", 100, 3000);
		BagDto dto1 = new BagDto(2, "Wild Craft", "Green", 150, 2000);
		BagDto dto2 = new BagDto(3, "American turiest", "Red", 120, 1500);
		BagDto dto3 = new BagDto(4, "Addidas", "White", 200, 2500);
		BagDto dto4 = new BagDto(5, "Nike", "Brown", 180, 3500);
		
//		repo.save(dto);
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
		
		System.out.println(repo.findByName("Nike"));
		
		
		System.out.println(repo.FindByNameAndId("Addidas", 4));
	}

}
