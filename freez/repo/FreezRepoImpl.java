package com.xworkz.freez.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.freez.dto.FreezDto;
import com.xworkz.freez.utils.DButils;

public class FreezRepoImpl implements FreezRepo {

	@Override
	public boolean saveAll(FreezDto dto) {
		
		String query = "insert into freez values(?,?,?,?,?)";
		
		try(Connection connection = DButils.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setInt(4, dto.getCapasity());
			statement.setInt(5, dto.getRating());
			
			statement.executeUpdate();
			
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<FreezDto> read() {
		
		String query = "select * from freez";
		
		try(Connection connection = DButils.getconnection();
				PreparedStatement statement = connection.prepareStatement(query);){
			
			ResultSet set =statement.executeQuery();
			
			List<FreezDto> list = new ArrayList<FreezDto>();
			
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String color = set.getString(3);
				int capasity = set.getInt(4);
				int rating =set.getInt(5);
				
				FreezDto dto = new FreezDto(id, name, color, capasity, rating);
				list.add(dto);
				
			}
			
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	

}
