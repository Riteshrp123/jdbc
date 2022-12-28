package com.xworkz.games.gamerepo;

import java.util.List;

import com.xworkz.games.gamesdto.GamesDto;

public interface GameRepo {

	public boolean save(GamesDto data);

	public List<GamesDto> read();
	
	public List<GamesDto> findByName(String name);

	public boolean updateByIndex(int index);

	public boolean deleteByIndex(int index);
	
	public boolean updateNameByPrice(int price,String name);

	public boolean deleteBySize(int size);
	
	public boolean deleteplayinByName(String name,String playin);


}
