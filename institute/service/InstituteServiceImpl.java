package com.xworkz.institute.service;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;
import com.xworkz.institute.repo.InstituteRepo;
import com.xworkz.institute.repo.InstituteRepoImpl;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepo repo = new InstituteRepoImpl();
	
	@Override
	public boolean save(InstituteDto dto) {
		if(dto!=null && dto.getName().length()>=4);
		System.out.println("Data is save and send to repo");
	  repo.save(dto);
		return true;
	}

	@Override
	public List<InstituteDto> read() {
		 System.out.println("Data is send to repo for validation");
		return repo.read();
	}

	@Override
	public boolean updateLocationByIndex(int index, String location) {
		if(location!=null && location.length()>=3)
			if(index>=0)
				System.out.println("Data is validate and send to repo");
		return repo.updateLocationByIndex(index, location);
	}

	@Override
	public boolean updateCourseByName(String name, String course) {
		if(name!=null && name.length()>=3)
			System.out.println("Data is update");
		return repo.updateCourseByName(name, course);
	}

	@Override
	public boolean deleteByRating(int rating) {
		if(rating>=0)
			System.out.println("Data is validate");
		repo.deleteByRating(rating);
		return true;
	}

	@Override
	public InstituteDto findByNameAndCourse(String name, String course) {
		if(name!=null && name.length()>=3 )
			if(course!=null && course.length()>=3)
			System.out.println("Data is valid");
		List<InstituteDto> data = repo.findByNameAndCourse(name, course);
		for(InstituteDto dto : data) {
			if(dto.getName().equals(name) && dto.getCourse().equals(course)) {
				return dto;
			}
		}
		return null;
	}

	@Override
	public InstituteDto findByLocationAndRating(String location,int rating) {
		if(location!=null && location.length()>=3)
			if(rating>=0)
				System.out.println("Data validated and send to repo");
		List<InstituteDto> found = repo.findByLocationAndRating(location, rating);
		for(InstituteDto dto : found) {
			if(dto.getLocation().equals(location) && dto.getRating()==rating)
			return dto;
		}
		return null;
	}

}


