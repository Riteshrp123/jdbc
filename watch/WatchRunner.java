package com.xworkz.watch;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {

	public static void main(String[] args) {

		WatchService service = new WatchServiceImpl();

		WatchDto dto = new WatchDto(1, "Titan", "Golden", "Analog", 5000);
		WatchDto dto1 = new WatchDto(2, "Sonata", "Black", "Digital", 2000);
		WatchDto dto2 = new WatchDto(3, "Rolex", "White", "Analog", 10000);
		WatchDto dto3 = new WatchDto(4, "Gshoke", "Brown", "Digital", 6000);
		WatchDto dto4 = new WatchDto(5, "Noise", "Green", "Smart watch", 12000);
		WatchDto dto5 = new WatchDto(6, "Casio", "Vintage", "Wall clock", 1800);
		WatchDto dto6 = new WatchDto(7, "Fasttrack", "Silver", "Digital", 1500);
		WatchDto dto7 = new WatchDto(8, "Fossil", "Charcol", "Analog", 2500);
		WatchDto dto8 = new WatchDto(9, "Timex", "Red", "Analog", 1400);
		WatchDto dto9 = new WatchDto(10, "Seiko", "Pink", "Bell clock", 15000);

		WatchDto[] list = { dto, dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9 };
		for (int i = 0; i < list.length; i++) {
			service.saveAll(list[i]);

		}
		System.out.println(service.findByBrandNameAndColor("Timex", "Red"));
		System.out.println(service.findByIdAndType(5, "Smart watch"));
		System.out.println(service.updateBrandNameById("one pluse", 8));
		System.out.println(service.deleteByColorAndType("Vintage", "Wall clock"));
		for (WatchDto data : service.read()) {
			System.out.println(data);
		}
	}
}
