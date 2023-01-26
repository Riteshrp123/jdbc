package com.xworkz.cake.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;

import com.xworkz.cake.dto.CakeDto;

public class CakeRepoImpl implements CakeRepo {
	
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public boolean save(CakeDto dto) {
			if(entityManager!=null) {
				entityManager.getTransaction().begin();
			    entityManager.persist(dto);
			    entityManager.getTransaction().commit();
			    return true;
			}
		    
		  return false; 
		    
	}

	public List<CakeDto> readAll() {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			TypedQuery<CakeDto> dto =  entityManager.createQuery("SELECT c from CakeDto c",CakeDto.class);
			 List list=dto.getResultList();
		    entityManager.getTransaction().commit();
		    return list;
	}
		return null;
	}

	public CakeDto findById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
		 CakeDto dto=entityManager.find(CakeDto.class, id);
		    entityManager.getTransaction().commit();
		return dto;
		}
		return null;
	}

	public boolean updateNameById(String name,int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
		    CakeDto data = entityManager.find(CakeDto.class, id);
		    data.setName(name);
		    entityManager.merge(data);
		    System.out.println("data is update sucessfully");
		    entityManager.getTransaction().commit();	
		    return true;
			}
		return false;
	
}
	

	public boolean deleteById(int id) {
		if(entityManager!=null) {
			entityManager.getTransaction().begin();
			 CakeDto data = entityManager.find(CakeDto.class, id);
		  entityManager.remove(data);
		  System.out.println("Data is delete succesfull");
		    entityManager.getTransaction().commit();
		return true;
	}
		return false;
	}
	
}

