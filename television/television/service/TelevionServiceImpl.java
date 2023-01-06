package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.repo.TelevionRepo;
import com.xworkz.television.repo.TelevionRepoImpl;

public class TelevionServiceImpl implements TelevionService{
	
	TelevionRepo repo = new TelevionRepoImpl();

	@Override
	public boolean save(TelevisionDto dto) {
		if(dto!=null && dto.getBrandName().length()>=3 && dto.getPrice()>=100000 && dto.getScreenSize()>=100)
			System.out.println("Data is Valid and send to repo");
		repo.save(dto);
		return true;
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("Data is validated");
		return repo.read();
	}

	@Override
	public TelevisionDto findByBrandNameAndSize(String brandName, int size) {
		if(brandName!=null && brandName.length()>=3) 
				if(size>=0)
			System.out.println("Data is verify");
		List<TelevisionDto> found = repo.findByBrandNameAndSize(brandName,size);
		   for(TelevisionDto dto : found) {
			   if(dto.getBrandName().equals(brandName) && dto.getScreenSize()==size) {  
				  return dto;
		   }
		   
			   
		   }
		return null;
	}

	@Override
	public TelevisionDto findTypeAndColourByIndex( int index) {
		if(index>=0)
			System.out.println("Data is found");
		List<TelevisionDto> data = repo.findTypeAndColourByIndex(index);
		TelevisionDto  dto = data.get(index);
		
		return dto;
	}

	@Override
	public boolean updateByTypeAndSize(String type, int size) {
		if(type!=null && type.length()>=3 && size>=0) {
			System.out.println("Data is update ");
			repo.updateByTypeAndSize(type, size);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		if(size>=0 && type!=null && type.length()>=3)
			System.out.println("Data is valid for update");
				return repo.updateSizeByType(size, type);
	}

	@Override
	public boolean DeleteBYnameAndColour(String name, String colour) {
		if(name!=null && name.length()>=3 && colour!=null && colour.length()>=3)
			repo.DeleteBYnameAndColour(name,colour);
		return  true;
				
	}

}
