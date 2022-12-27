package com.xworkz.mobile.mobilerepo;

import java.util.List;

import com.xworkz.mobile.mobiledto.MobileDto;

public interface MobileRepo {
	
	public boolean save(MobileDto dto);
	
	public List<MobileDto> read();

	public List<MobileDto> findByName(String name);
	
	public boolean deleteByIndex(int index);
	
	public boolean updateNameByIndex(int index,String name);
	

}
