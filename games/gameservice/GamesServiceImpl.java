package com.xworkz.games.gameservice;

import java.util.List;

import com.xworkz.games.gamerepo.GameRepo;
import com.xworkz.games.gamerepo.GameRepoImpl;
import com.xworkz.games.gamesdto.GamesDto;

public class GamesServiceImpl implements GamesService {

	GameRepo repo = new GameRepoImpl();
	
	@Override
	public boolean save(GamesDto data) {
		if(data!=null && data.getG_name().length()>=3 && data.getPlayIn().length()>=2 && data.getPrice()>=500
				&& data.getSize()>=5 && data.getType().length()>=2) {
			System.out.println("All data is saved");
		repo.save(data);
		return true;
	}
		return false;
	
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("All data read and send to repo");
		return repo.read();
	}
	@Override
	public GamesDto findByName(String name) {
		if(name!=null && name.length()>=3) 
			 System.out.println("Theater name is valid");
		List<GamesDto> dtos = repo.findByName(name);
		for(GamesDto dto : dtos) {
			if(dto.getG_name().equals(name)){
		return dto;	
		}
	}
		return null;
}

	@Override
	public boolean updateByIndex(int index) {
		if(index>=0)
			System.out.println();
			repo.updateByIndex(index);
		return false;
	}

	@Override
	public boolean deleteByIndex(int index) {
		if(index>=0)
			System.out.println("data is deleted succesfully");
		repo.deleteByIndex(index);
		return true;
	}

	@Override
	public boolean updateNameByPrice(int price, String name) {
		if(name!=null && name.length()>=3)
			if(price>=500 && price<=20000)
				System.out.println("Data is updated");
	     //  boolean dto = repo.updateNameByPrice(price,name);
		  return repo.updateNameByPrice(price,name);
	}

	@Override
	public boolean deleteBySize(int size) {
		if(size>=5 && size<=100)
				System.out.println("Data deleted by size");
		 repo.deleteBySize(size);
		return true;
	}

	@Override
	public boolean deleteplayinByName(String name, String playin) {
		if(name!=null && name.length()>=3)
			if(playin!=null && playin.length()>=2)
				System.out.println("Data is delete through playin");
		repo.deleteplayinByName(name, playin);
		return true;
	}

	
}
