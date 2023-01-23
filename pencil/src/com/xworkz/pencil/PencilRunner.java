package com.xworkz.pencil;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.xworkz.pencil.config.PencilConfiguration;
import com.xworkz.pencil.dto.PencilDto;

public class PencilRunner {

	public static void main(String[] args) {
		
		
		 
	//	PencilDto dto = new PencilDto(1, "Natraj", 10, "Graphait", "writing");
		PencilDto dto1 = new PencilDto(2, "Doms", 15, "Fusion", "Draw");
		PencilDto dto2 = new PencilDto(3, "Apsara", 8, "Scooboo", "Art");
		PencilDto dto3 = new PencilDto(4, "Crayla", 20, "Polychromos", "Color");
		PencilDto dto4 = new PencilDto(5, "Castle", 30, "Grove", "Color");
		
		 Session session = PencilConfiguration.getSessionFactory().openSession();
		 Transaction transaction = session.beginTransaction();
		
	//	session.save(dto);
		session.save(dto1);
		transaction.commit();
		session.close();
	}
	
}
