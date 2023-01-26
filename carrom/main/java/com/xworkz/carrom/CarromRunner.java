package com.xworkz.carrom;

import com.xworkz.carrom.dto.CarromDto;
import com.xworkz.carrom.service.CarromService;
import com.xworkz.carrom.service.CarromServiceImpl;

public class CarromRunner {

	public static void main(String[] args) {
      
		CarromService service = new CarromServiceImpl();
		
		CarromDto Dto = new CarromDto(1, "Lukas", "Wood",20, 4);
		CarromDto Dto1 = new CarromDto(2, "Pericis", "Plastic",19, 3);
		CarromDto Dto2 = new CarromDto(3, "Barist", "Glass",20, 4);
		CarromDto Dto3 = new CarromDto(4, "Carrom", "Wood",20, 4);
		CarromDto Dto4 = new CarromDto(5, "Sarti", "Wood",20, 4);
		
//		service.save(Dto);
//		service.save(Dto1);
//		service.save(Dto2);
//		service.save(Dto3);
//		service.save(Dto4);
		
		//System.out.println(service.findById(3));
	//	System.out.println(service.updateBrandNameById("Hrtr", 5));
	service.deleteByid(3);
	}

}
