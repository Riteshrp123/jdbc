package com.xworkz.mobile.mobile1;

import java.util.List;

import com.xworkz.mobile.mobiledto.MobileDto;
import com.xworkz.mobile.mobileservice.MobileService;
import com.xworkz.mobile.mobileservice.MobileServiceImpl;

public class MobileRunner {
	public static void main(String[] args) {
		
		MobileService service = new MobileServiceImpl();
		
		MobileDto dto = new MobileDto("Samsung","Golden",100000,"South koria",true,8);
		MobileDto dto1 = new MobileDto("Apple","White",150000,"America",true,12);
		MobileDto dto2 = new MobileDto("Micromax","Black",20000,"India",true,4);
		MobileDto dto3 = new MobileDto("Realme","Green",40000,"China",true,6);
		MobileDto dto4 = new MobileDto("Nokia","Blue",50000,"Finland",true,8);
		MobileDto dto5 = new MobileDto("Asus","Pink",23000,"Taiwan",true,4);
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		
		service.deleteByIndex(2);
		List<MobileDto> data =service.read();
		service.findByName("Apple");
		System.out.println(service.findByName("Apple"));
       service.updateNameByIndex(4,"Iqoo");
		
		for(MobileDto mobile : data) {
			System.out.println(mobile);
		}
    }
}
