package com.xworkz.carrom.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.carrom.dto.CarromDto;

public class CarromRepoImpl implements CarromRepo {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(CarromDto dto) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			entityManager.persist(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

	public CarromDto findById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			CarromDto dto = entityManager.find(CarromDto.class, id);
			entityManager.getTransaction().commit();
			return dto;
		}
		return null;
	}

	public boolean updateNameById(String name, int id) {
		if(entityManager!=null) {
		entityManager.getTransaction().begin();
	CarromDto data	=entityManager.find(CarromDto.class, id);
		data.setBrandName(name);
		entityManager.merge(data);
		entityManager.getTransaction().commit();
		return true;
	}
		return false;
	}
	public boolean deleteByid(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
		CarromDto dto =	entityManager.find(CarromDto.class, id);
			entityManager.remove(dto);
			entityManager.getTransaction().commit();
			return true;
		}
		return false;
	}

}
