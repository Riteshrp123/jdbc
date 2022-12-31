package com.xworkz.institute.service;

import java.util.List;

import com.xworkz.institute.dto.InstituteDto;

public interface InstituteService {

	public boolean save(InstituteDto dto);
	
	public List<InstituteDto> read();
	
	public boolean updateLocationByIndex(int index,String location);
	
	public boolean updateCourseByName(String name,String course);
	
	public boolean deleteByRating(int rating);
	
	public InstituteDto findByNameAndCourse(String name,String course);
	
	public InstituteDto findByLocationAndRating(String location,int rating);
	
}
