package com.xworkz.games;

import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;
import com.xworkz.games.gameservice.GamesService;
import com.xworkz.games.gameservice.GamesServiceImpl;

public class GameRunner {
	
	public static void main(String[] args) {
		
		GamesService service = new GamesServiceImpl();
		
		GamesDto dto = new GamesDto("God of war",60,5000,"Action game","pc",true);
		GamesDto dto1 = new GamesDto("Gta",80,3000,"Funy game","pc",true);
		GamesDto dto2 = new GamesDto("Bgmi",5,1000,"Action game","mobile",false);
		GamesDto dto3 = new GamesDto("Need for speed",6,2000,"Race game","mobile",false);
		GamesDto dto4 = new GamesDto("Spider man",50,5000,"Action game","Xbox",true);
		
		
		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		
		List<GamesDto> Data = service.read();
		System.out.println(Data);
		service.deleteBySize(80);
    service.deleteByIndex(3);
    service.deleteplayinByName("Gta", "pc");
	service.findByName("Bgmi");
	System.out.println(service.findByName("Bgmi"));
	System.out.println(service.updateByIndex(2));
	System.out.println(service.updateNameByPrice(2000, "IgI"));
	List<GamesDto> returned = service.read();
        for(GamesDto game : returned) {
		 System.out.println(game);	
	}
	}	
}