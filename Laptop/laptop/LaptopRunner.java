package com.xworkz.laptop;

import java.util.List;

import com.xworkz.laptopservice.LaptopService;
import com.xworkz.laptopservice.LaptopServiceImpl;

public class LaptopRunner {
	public static void main(String[] args) {
		
		LaptopService service = new LaptopServiceImpl();
		
		LaptopDto dto = new LaptopDto("Dell",50000,"Silver",500,16,true,true,17,3000,true);
		LaptopDto dto1 = new LaptopDto("Lenovo",40000,"Black",1000,8,true,true,116,4000,false);
		LaptopDto dto2 = new LaptopDto("Asus",70000,"Yellow",750,32,true,true,15,5000,true);
		LaptopDto dto3 = new LaptopDto("Hp",80000,"Blue",1000,16,true,true,14,3500,true);
		LaptopDto dto4 = new LaptopDto("Infinix",30000,"red",500,4,true,false,13,2500,true);
		LaptopDto dto5 = new LaptopDto("Acer",25000,"Brown",250,6,false,true,15,3000,true);
		LaptopDto dto6 = new LaptopDto("Msi",35000,"White",500,4,true,true,15,5000,true);
		LaptopDto dto7 = new LaptopDto("Apple",100000,"Black",2000,32,true,true,17,3300,true);
		LaptopDto dto8 = new LaptopDto("Samsung",90000,"Green",1000,16,true,true,16,3500,true);
		LaptopDto dto9 = new LaptopDto("Realme",45000,"Orange",500,16,true,true,15,3000,true);
		LaptopDto dto10 = new LaptopDto("Redmi",30000,"Black",800,8,true,true,12,3000,true);
		LaptopDto dto11 = new LaptopDto("Lg",50000,"Silver",1500,64,true,true,18,3800,true);
		LaptopDto dto12 = new LaptopDto("Walton",55000,"Black",1250,16,true,true,17,3700,true);
		LaptopDto dto13 = new LaptopDto("Huawei",20000,"White",250,4,false,true,14,3100,false);
		LaptopDto dto14 = new LaptopDto("Honor",25000,"Silver",300,2,true,true,13,2500,true);
		
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
		service.save(dto10);
		service.save(dto11);
		service.save(dto12);
		service.save(dto13);
		service.save(dto14);
		
		service.deletByIndex(5);
		
		List<LaptopDto> data = service.read();
		
		service.findByName("Honor");
		System.out.println(service.findByName("Honor"));
		service.updateNameByIndex(4, "realme");
		for(LaptopDto laptop : data) {
			System.out.println(laptop); 
		
	}
	}
}