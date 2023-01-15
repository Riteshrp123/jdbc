package com.xworkz.freez;

import com.xworkz.freez.dto.FreezDto;
import com.xworkz.freez.service.FreezService;
import com.xworkz.freez.service.FreezServiceImpl;

public class FreezRunner {

	public static void main(String[] args) {
		
		FreezService service = new FreezServiceImpl();
		
		FreezDto dto = new FreezDto(1, "Lg", "Red", 290, 4);
		FreezDto dto1 = new FreezDto(2, "Samsung", "Blue", 234, 5);
		FreezDto dto2 = new FreezDto(3, "Whirlpool", "Silver", 290, 3);
		FreezDto dto3 = new FreezDto(4, "Godrej", "Black", 184, 4);
		FreezDto dto4 = new FreezDto(5, "Panasonic", "White", 400, 5);
		
		FreezDto[] list = {dto,dto1,dto2,dto3,dto4};
//		for (int i = 0; i < list.length; i++) {
//			service.saveAll(list[i]);
     for(FreezDto data : list) {
    	 System.out.println(data);
     }
}
}
