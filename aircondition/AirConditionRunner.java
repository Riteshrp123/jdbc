package com.xworkz.aircondition;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.aircondition.config.AirConditionConfig;
import com.xworkz.aircondition.dto.AirConditionDto;

public class AirConditionRunner {

	public static void main(String[] args) {

		AirConditionDto dto = new AirConditionDto(1, "Samsung", 50000, 5, "Centra AirConditioner");
		AirConditionDto dto1 = new AirConditionDto(2, "Lg", 40000, 4, "Smart AirConditioner");
		AirConditionDto dto2 = new AirConditionDto(3, "Voltage", 20000, 3, "Window AirConditioner");
		AirConditionDto dto3 = new AirConditionDto(4, "Whirlpool", 30000, 4, "Portable AirConditioner");
		AirConditionDto dto4 = new AirConditionDto(5, "Hitachi", 25000, 3, "Evaporative AirConditioner");

		Session session = AirConditionConfig.getSessionFactory().openSession();

		Transaction transaction = session.beginTransaction();
		//System.out.println(session.get(AirConditionDto.class, 3));
		//System.out.println(session.get(AirConditionDto.class, "Lg"));
		Criteria criteria = session.createCriteria(AirConditionDto.class);
		List<AirConditionDto> list = new ArrayList<AirConditionDto>();

		list = criteria.list();
		for (AirConditionDto dtos : list) {
			System.out.println(dtos);
		}
		session.save(dto);
		session.save(dto1);
		session.save(dto2);
		session.save(dto3);
		session.save(dto4);
		transaction.commit();
		session.close();
	}

}
