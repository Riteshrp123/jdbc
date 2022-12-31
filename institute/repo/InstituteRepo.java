package com.xworkz.institute.repo;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;

public interface InstituteRepo {
	
	public boolean save(InstituteDto dto);

	public List<InstituteDto> read();
	
	public boolean updateLocationByIndex(int index,String location);
	
	public boolean updateCourseByName(String name,String course);
	
	public boolean deleteByRating(int rating);

	public List<InstituteDto> findByNameAndCourse(String name, String course);

	public List<InstituteDto> findByLocationAndRating(String location,int rating);

}
