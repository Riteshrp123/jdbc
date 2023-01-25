package com.xworkx.biscuit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkx.biscuit.dto.BiscuitDto;

public class BiscuitDRunner {

	public static void main(String[] args) {
    
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("databaseProperties");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		
		BiscuitDto dto = new BiscuitDto(1, "Parle-G", 5, "Normal", 10);
		BiscuitDto dto1 = new BiscuitDto(2, "Tiger", 10, "Salty", 12);
		BiscuitDto dto2 = new BiscuitDto(3, "Oreo", 20, "Crem", 15);
		BiscuitDto dto3 = new BiscuitDto(4, "Good day", 15, "Crem", 13);
		BiscuitDto dto4 = new BiscuitDto(5, "Mario", 30, "Sugar", 30);
		BiscuitDto dto5 = new BiscuitDto(6, "Unibic", 20, "Cookies", 20);
		BiscuitDto dto6 = new BiscuitDto(7, "Horlicks",25, "Miky", 25);
		BiscuitDto dto7 = new BiscuitDto(8, "Monoco",10, "Salty", 15);
		BiscuitDto dto8 = new BiscuitDto(9, "Dream light",22, "Sugar", 32);
		BiscuitDto dto9 = new BiscuitDto(10, "Wellness",40, "Normal", 50);
		BiscuitDto dto10 = new BiscuitDto(11, "Drools",5, "Normal", 23);
		
		entityManager.persist(dto);
		entityManager.persist(dto1);
		entityManager.persist(dto2);
		entityManager.persist(dto3);
		entityManager.persist(dto4);
		entityManager.persist(dto5);
		entityManager.persist(dto6);
		entityManager.persist(dto7);
		entityManager.persist(dto8);
		entityManager.persist(dto9);
		entityManager.persist(dto10);
		
		BiscuitDto dtos = entityManager.find(BiscuitDto.class, 11);
		System.out.println(dtos);
	
		
		dto9.setName("Britaniya");
		entityManager.merge(dto9);
		entityManager.remove(dtos);
		
		entityManager.getTransaction().commit();
		
	
	
	}
}
