package com.xworkz.games.gamerepo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;

public class GameRepoImpl implements GameRepo {
	
	List <GamesDto> list = new ArrayList<GamesDto>();

	@Override
	public boolean save(GamesDto data) {
		System.out.println("Data is add succesfully");
		list.add(data);
		return true;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("Data is read succesfully");
		return list;
	}

	@Override
	public List<GamesDto> findByName(String name) {
		System.out.println("Data is found");
		return list;
	}

	@Override
	public boolean updateByIndex(int index) {
		GamesDto dto = list.get(index);
		dto.setG_name("MindCraft");
		System.out.println("Data is updated");
		list.set(index, dto);
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return true;
	}

	@Override
	public boolean updateNameByPrice(int price,String name) {
		for(int i = 0;i<list.size();i++) {
			GamesDto dto = list.get(i);
			if(dto.getPrice()==price);
			System.out.println("Data is get the value");
			dto.setG_name(name);
			System.out.println("Name is set");
			list.set(i, dto);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBySize(int size) {
		for(int i =0;i<list.size();i++) {
			GamesDto dto = list.get(i);
			if(dto.getSize()==size) {
				dto.setSize(size);
				list.remove(i);
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean deleteplayinByName(String name, String playin) {
		for(int i =0;i<list.size();i++) {
			GamesDto dto = list.get(i);
			if(dto.getG_name()==name) {
				dto.setPlayIn(playin);
				list.remove(i);
		return true;
	}
		}
		return false;
}
}