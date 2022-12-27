package com.xworkz.mobile.mobilerepo;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.mobiledto.MobileDto;

public class MobileRepoImpl implements MobileRepo {
	
	List<MobileDto> list = new ArrayList<MobileDto>();

	@Override
	public boolean save(MobileDto dto) {
	   list.add(dto);
	   System.out.println("Data is saved");
		return true;
	}

	@Override
	public List<MobileDto> read() {
		return list;
	}

	@Override
	public List<MobileDto> findByName(String name) {
		System.out.println("Mobile name is found succesfully");
		return list;
	}

	@Override
	public boolean deleteByIndex(int index) {
		list.remove(index);
		return true;
	}

	@Override
	public boolean updateNameByIndex(int index, String name) {
		MobileDto returned = list.get(index);
		returned.setName(name);
		System.out.println("Mobile name is updated");
		list.set(index, returned);
		return true;
	}

}
