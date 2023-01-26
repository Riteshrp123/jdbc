package com.xworkz.cake.service;

import java.util.List;

import com.xworkz.cake.dto.CakeDto;
import com.xworkz.cake.repo.CakeRepo;
import com.xworkz.cake.repo.CakeRepoImpl;

public class CakeServiceImpl implements CakeService {
	
	CakeRepo repo = new CakeRepoImpl();

	public boolean save(CakeDto dto) {
		if(dto!=null) {
			if(dto.getId()>0) {
				System.out.println("Data is valid and dto send to repo");
				return repo.save(dto);
			}
		}
		return false;
	}

	public List<CakeDto> readAll() {
		return repo.readAll();
		
	}

	public CakeDto findById(int id) {
		if(id>0) {
			System.out.println("Data is valid and pass to repo");
		return repo.findById(id);
			
			
		}
		return null;
	}

	public boolean updateNameById(String name,int id) {
		if(name!=null) {
			if(id>0) {
				System.out.println("Data is valid and pass to repo");
		return	repo.updateNameById(name, id);
			}
		}
		return false;
	}

	public boolean deleteById(int id) {
		if(id>0) {
		  System.out.println("Data is valid and passing to repo");
		return  repo.deleteById(id);
		  
		}
		return false;
	}

}
