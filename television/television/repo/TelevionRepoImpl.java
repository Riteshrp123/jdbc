package com.xworkz.television.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public class TelevionRepoImpl implements TelevionRepo {
	
	List<TelevisionDto> list = new ArrayList<TelevisionDto>();

	@Override
	public boolean save(TelevisionDto dto) {
		System.out.println("Data is save succesfully");
		list.add(dto);
		return true;
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("Data read succesfully");
		return list;
	}

	@Override
	public List<TelevisionDto> findByBrandNameAndSize(String brandName, int size) {
		System.out.println("data found succesfully");
		return list;
	}

	@Override
	public List<TelevisionDto> findTypeAndColourByIndex(int index) {
		System.out.println("data is found");
		return list;
	}

	@Override
	public boolean updateByTypeAndSize(String type, int size) {
		for(int i=0;i<list.size();i++) {
			TelevisionDto dto = list.get(i);
			if(dto.getType().equals(type) && dto.getScreenSize()==size) {
				System.out.println("Data is validated");
				dto.setBrandName(type);
			}
		}
		return false;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		for(int i=0;i<list.size();i++) {
			TelevisionDto dto = list.get(i);
			if(dto.getScreenSize()==size && dto.getType().equals(type)) {
				System.out.println("Data is validated");
				dto.setScreenSize(size);
				list.set(i, dto);
				return true;
			}
	}
		return false;
	}
	@Override
	public boolean DeleteBYnameAndColour(String name, String colour) {
		Iterator<TelevisionDto> data = list.iterator();
		while(data.hasNext()) {
			TelevisionDto dto = data.next();
			System.out.println("dta is deteted");
			data.remove();
			return true;
		}
		return false;
			
	}
	
	

}
