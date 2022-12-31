package com.xworkz.institute.dto;

public class InstituteDto {
	
	private String name;
	private String location;
	private int noOfTrainers;
	private int noOfStudent;
	private String course;
	private int rating;
	
	
	public InstituteDto() {
		System.out.println("Default constructor of Institute");
		
	}
	
	public InstituteDto(String name, String location, int noOfTrainers, int noOfStudent, String course, int rating) {
		super();
		this.name = name;
		this.location = location;
		this.noOfTrainers = noOfTrainers;
		this.noOfStudent = noOfStudent;
		this.course = course;
		this.rating = rating;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public int getNoOfStudent() {
		return noOfStudent;
	}
	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	@Override
	public String toString() {
		return "InstituteDto [name=" + name + ", location=" + location + ", noOfTrainers=" + noOfTrainers
				+ ", noOfStudent=" + noOfStudent + ", course=" + course + ", rating=" + rating + "]";
	}
	

}
