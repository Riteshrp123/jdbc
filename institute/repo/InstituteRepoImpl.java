package com.xworkz.institute.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institute.dto.InstituteDto;

public class InstituteRepoImpl implements InstituteRepo {

	List<InstituteDto> list = new ArrayList<InstituteDto>();
	
	@Override
	public boolean save(InstituteDto dto) {
		list.add(dto);
		return true;
	}

	@Override
	public List<InstituteDto> read() {
		System.out.println("Data read succsefully");
		return list;
	}

	@Override
	public boolean updateLocationByIndex(int index, String location) {
	  InstituteDto updated = list.get(index);
	  updated.setLocation(location);
	  System.out.println("Data is updated by index succesfully");
	  list.set(index, updated);
		return true;
	}

	@Override
	public boolean updateCourseByName(String name, String course) {
		for(int i = 0;i<list.size();i++) {
			InstituteDto dto = list.get(i);
			if(dto.getName().equals(name)) {				
			System.out.println("Data is matched");
				dto.setCourse(course);
				System.out.println("Data is go to repo for validation");
				list.set(i, dto);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByRating(int rating) {
		Iterator<InstituteDto> itr = list.iterator();
		while(itr.hasNext()) {
			InstituteDto data = itr.next();
			if(data.getRating()==rating) {
				System.out.println("Data is delete succesfully");
				itr.remove();
		return true;
	}
	
}
		return false;
	}

	@Override
	public List<InstituteDto> findByNameAndCourse(String name, String course) {
		System.out.println("Data is found succesfully");
		return list;
	}

	@Override
	public List<InstituteDto> findByLocationAndRating(String location,int rating) {
		System.out.println("Data is found succesfully");
		return list;
	}
}

