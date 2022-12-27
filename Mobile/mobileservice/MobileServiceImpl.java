package com.xworkz.mobile.mobileservice;

import java.util.List;

import com.xworkz.mobile.mobiledto.MobileDto;
import com.xworkz.mobile.mobilerepo.MobileRepo;
import com.xworkz.mobile.mobilerepo.MobileRepoImpl;

 public class MobileServiceImpl implements MobileService {
	
	MobileRepo repo = new MobileRepoImpl();

	@Override
	public boolean save(MobileDto dto) {
		if(dto!=null ) {
			if(dto.getName().length()>=3) {
				System.out.println("Mobile data is save succesfully");
				repo.save(dto);
		return true;
	}
}
		return false;
	}

	@Override
	public List<MobileDto> read() {
		System.out.println("all data is read");
		return repo.read();
	}

	@Override
	public MobileDto findByName(String name) {
	  if(name!=null) {
		  if(name.length()>=3)
			  System.out.println("Theater name is valid");
				List<MobileDto> dtos = repo.findByName(name);
				for(MobileDto dto : dtos) {
					if(dto.getName().equals(name)){
				return dto;
	}
	  }
	}

	return null;
	  
	}

	@Override
	public boolean deleteByIndex(int index) {
		if(index>=0)
			System.out.println("Data is delete succesfully");
			repo.deleteByIndex(index);
		return true;
	}

	@Override
	public boolean updateNameByIndex(int index, String name) {
		if(name!=null && name.length()>=4)
			if(index>=0)
				System.out.println("Data is updated");
				repo.updateNameByIndex(index, name);
		return true;
	}
 }