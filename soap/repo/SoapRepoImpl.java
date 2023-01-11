package com.xworkz.soap.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.soap.constants.SqlCredential;
import com.xworkz.soap.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {
	   
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			String query = "INSERT INTO soap VALUES(?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1,dto.getId());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getPrice());
			statement.setString(4, dto.getColor());	
			statement.setString(5, dto.getFreagrance());
			statement.setInt(6, dto.getWeight());
			statement.setInt(7,dto.getManufactureDate());
			statement.setString(8, dto.getType());
			
			statement.executeUpdate();
			
			statement.close();
			connection.close();
				
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}

	@Override
	public List<SoapDto> read() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			
			String query = "SELECT * FROM  soap";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			ResultSet set = statement.executeQuery();

			List<SoapDto> list = new ArrayList<SoapDto>();
			
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			int price = set.getInt(3);
			String color = set.getString(4);
			String freagrance = set.getString(5);
			int weight = set.getInt(6);
			int manufactured = set.getInt(7);
			String type = set.getString(8);
			
			SoapDto dto =  new SoapDto(id, name, price, color, freagrance, weight, manufactured, type);
			list.add(dto);
		}	
		
		statement.close();
		connection.close();
		   return list;
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, int price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
              String query = "SELECT * fROM soap where name=? and price=?";
			
			PreparedStatement ststement = connection.prepareStatement(query);
			
           ststement.setString(1, name);
			
			ststement.setInt(2,price);
			
			ResultSet set = ststement.executeQuery();
			
			while(set.next()) {
				int id = set.getInt(1);
				String name1 = set.getString(2);
				int price1 = set.getInt(3);
				String color =set.getString(4);
				String freagrance = set.getString(5);
				int weight = set.getInt(6);
				int manufactureDate = set.getInt(7);
				String type = set.getString(8);
				
				SoapDto dto = new SoapDto(id, name1, price1, color, freagrance, weight, manufactureDate, type);
			
			
			ststement.close();
			connection.close();	
				return dto;
			}				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public boolean updateColorAndFreagranceByName(String color,String freagrance,String name) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			String query = "Update soap set color=?, freagrance=? where name=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, color);
			statement.setString(2, freagrance);
			statement.setString(3, name);
		
			statement.executeUpdate();
			
			statement.close();
			connection.close();
			return true;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return false;
	}

	@Override
	public boolean updateNamebyPrice(String name, int price) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			String query = "Update soap set name=? where price=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, name);
			statement.setInt(2, price);
			
		   statement.executeUpdate();
			
			statement.close();
			connection.close();
			return true;    
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return false;
	}

	@Override
	public boolean upadateTypeById(String type, int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			String query = "Update soap set type=? where id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1,type);
			statement.setInt(2, id);
			
		   statement.executeUpdate();
			
			statement.close();
			connection.close();
			return true; 
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	
}
