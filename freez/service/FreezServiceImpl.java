package com.xworkz.freez.service;

import java.util.List;

import com.xworkz.freez.dto.FreezDto;
import com.xworkz.freez.repo.FreezRepo;
import com.xworkz.freez.repo.FreezRepoImpl;

public class FreezServiceImpl implements FreezService {

	FreezRepo repo = new FreezRepoImpl();

	@Override
	public boolean saveAll(FreezDto dto) {
		if (dto != null) {
			if (dto.getId() >= 0) {
				System.out.println("Freez id is valid and send to repo");
				if (dto.getName().length() >= 2) {
					System.out.println("Freez name is valid and send to repo");
					if (dto.getColor().length() >= 3) {
						System.out.println("Freez color is valid and send to repo");
						if (dto.getCapasity() >= 100) {
							System.out.println("Freez capasity is valid and send to repo");
							if (dto.getRating() >= 3) {
								System.out.println("Freez rating is valid and send to repo");
								repo.saveAll(dto);
								return true;
							}
						} else {
							System.out.println("Freez id is not valid");
						}
					} else {
						System.out.println("Freez name is not valid");
					}
				} else {
					System.out.println("Freez color is not valid");
				}
			} else {
				System.out.println("Freez capasity is not valid");
			}
		} else {
			System.out.println("Freez rating is not valid");
		}
		return false;
	}

	@Override
	public List<FreezDto> read() {
		return repo.read();
	}

}
