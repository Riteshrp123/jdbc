package com.xworkz.mobile.mobileservice;

import java.util.List;

import com.xworkz.mobile.mobiledto.MobileDto;

public interface MobileService {
	
	public boolean save(MobileDto dto);
	
    public List<MobileDto> read();
    
    public MobileDto findByName(String name);
    
    public boolean deleteByIndex(int index);
    
    public boolean updateNameByIndex(int index,String name);
}
