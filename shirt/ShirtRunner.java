package com.xworkx.shirt;

import java.util.List;

import com.xworkx.shirt.dto.ShirtDto;
import com.xworkx.shirt.repo.ShirtRepo;
import com.xworkx.shirt.repo.ShirtRepoImpl;

public class ShirtRunner {
	
	public static void main(String[] args) {
		
		ShirtRepo repo = new ShirtRepoImpl();
		
		ShirtDto dto = new ShirtDto(1, "Puma", "Blue", 40, true);
		ShirtDto dto1 = new ShirtDto(2, "Nike", "Green", 38, false);
		ShirtDto dto2 = new ShirtDto(3, "Levis", "Red", 42, false);
		ShirtDto dto3 = new ShirtDto(4, "Roadstar", "Black", 40, true);
		ShirtDto dto4 = new ShirtDto(5, "Integrity", "White", 39, false);
		
		
		repo.save(dto);
		repo.save(dto1);
		repo.save(dto2);
		repo.save(dto3);
		repo.save(dto4);
		
		 List<ShirtDto> list = repo.read();
	     for(ShirtDto dtos : list) {
		 System.out.println(dtos);
	}		
//	     System.out.println(repo.findByNameAndId("Levis", 3));
//       	 System.out.println(repo.updateSizeByName(39, "Nike"));
//	     System.out.println(repo.deletByColor("Red"));
//	     System.out.println(repo.deleteBySizeAndName(39, "Integrity"));
//	
         for(ShirtDto dtos : list) {
	     System.out.println(dtos);
	
        }
    }
}