package com.xworkz.institute;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;
import com.xworkz.institute.service.InstituteService;
import com.xworkz.institute.service.InstituteServiceImpl;

public class InstituteRunner {
	
	public static void main(String[] args) {
		
		InstituteService service = new InstituteServiceImpl();
		
		
		InstituteDto dto = new InstituteDto("Xworkz","Btm",7,40,"Java",4);
		InstituteDto dto1 = new InstituteDto("JsSpider","Marathali",10,100,"Java Script",4);
		InstituteDto dto2 = new InstituteDto("Bidyasagar","Jaydev",5,50,"Nda",3);
		InstituteDto dto3 = new InstituteDto("Vanik","Bbsr",15,200,"Ssc",4);
		InstituteDto dto4 = new InstituteDto("Mahindra","Barmunda",8,150,"Banking",4);
		
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List<InstituteDto> data = service.read();
		System.out.println(data);
		
		service.updateLocationByIndex(2, "Jaydev bihar");
		service.updateCourseByName("JsSpider", "Advance java");
		service.deleteByRating(3);
	     System.out.println(service.findByNameAndCourse("Vanik", "Ssc"));
	     System.out.println(service.findByLocationAndRating("Jaydev", 3));
	    	for(InstituteDto read : data) {
			System.out.println(read);
		}
	}
}