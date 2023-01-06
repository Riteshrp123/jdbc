package com.xworkz.television;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.service.TelevionService;
import com.xworkz.television.service.TelevionServiceImpl;

public class TelevionRunner {
	
	public static void main(String[] args) {
		
		TelevionService service = new TelevionServiceImpl();
		
		TelevisionDto dto = new TelevisionDto("Sony",60000,50,"Blue","Led");
		TelevisionDto dto1 = new TelevisionDto("Onida",20000,20,"Green","Box");
		TelevisionDto dto2 = new TelevisionDto("Samsung",40000,40,"Black","Lcd");
		TelevisionDto dto3 = new TelevisionDto("RealMe",30000,30,"White","4k");
		TelevisionDto dto4 = new TelevisionDto("Onepluse",25000,25,"Blue","3d");
		
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List<TelevisionDto> data = service.read();
		System.out.println(data);
		//System.out.println(service.findByBrandNameAndSize("Onida", 20));
		//System.out.println(service.findTypeAndColourByIndex(2));
		//service.DeleteBYnameAndColour("Onida", "Green");
		//service.updateByTypeAndSize("Lcd", 25);
		service.updateSizeByType(80, "Led");
		for(TelevisionDto dtos : data) {
		System.out.println(dtos);
		}	
		}
	}


