package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo = new WatchRepoImpl();

	@Override
	public boolean saveAll(WatchDto dto) {
		if (dto != null) {
			if (dto.getId() >= 0) {
				System.out.println("Id is valid and send to repo");
				if (dto.getBrandName().length() >= 3) {
					System.out.println("Brandname is valid and send to repo");
					if (dto.getColor().length() >= 2) {
						System.out.println("Color is valid and send to repo");
						if (dto.getType().length() >= 2) {
							System.out.println("Type is Valid and send to repo");
							if (dto.getPrice() <= 20000) {
								System.out.println("price is valid and sent to repo");
								repo.saveAll(dto);
								return true;
							}
						} else {
							System.out.println("Id is not valid");
						}
					} else {
						System.out.println("Brandname is not valid");
					}
				} else {
					System.out.println("Color is not valid");
				}
			} else {
				System.out.println("Type is not valid ");
			}
		} else {
			System.out.println("Price is not valid");
		}

		return false;
	}

	@Override
	public List<WatchDto> read() {
		return repo.read();
	}

	@Override
	public WatchDto findByBrandNameAndColor(String brandName, String color) {
		if (brandName != null && brandName.length() >= 3) {
			if (color != null && color.length() >= 3) {

				return repo.findByBrandNameAndColor(brandName, color);
			}
		}
		return null;

	}

	@Override
	public WatchDto findByIdAndType(int id, String type) {
		if (id >= 0) {
			if (type.length() >= 3) {
				return repo.findByIdAndType(id, type);
			}
		}
		return null;
	}

	@Override
	public boolean updateBrandNameById(String brandName, int id) {
		if (brandName != null && brandName.length() >= 3) {
			if (id >= 0) {
				return repo.updateBrandNameById(brandName, id);
			}
		}
		return false;
	}

	@Override
	public boolean deleteByColorAndType(String color, String type) {
		if (color != null && color.length() >= 3) {
			if (type != null && type.length() >= 3) {
				return repo.deleteByColorAndType(color, type);
			}
		}
		return false;
	}
}