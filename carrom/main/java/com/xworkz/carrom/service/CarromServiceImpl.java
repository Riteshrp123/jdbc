package com.xworkz.carrom.service;

import com.xworkz.carrom.dto.CarromDto;
import com.xworkz.carrom.repo.CarromRepo;
import com.xworkz.carrom.repo.CarromRepoImpl;

public class CarromServiceImpl implements CarromService {
	
	private CarromRepo repo = new CarromRepoImpl();

	public boolean save(CarromDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				System.out.println("Data is valid and pass to repo");
			return	repo.save(dto);
			}
		}
		return false;
	}

	public CarromDto findById(int id) {
		if(id>0) {
		return	repo.findById(id);
		}
		return null;
	}

	public boolean updateBrandNameById(String brandname, int id) {
		if(brandname!=null && brandname.length()>3) {
			if(id>0){
				return repo.updateNameById(brandname, id);
			}
	}
		return false;
	}
	public boolean deleteByid(int id) {
	   if(id>=0) {
		   return repo.deleteByid(id);
	   }
		return false;
	}

}
