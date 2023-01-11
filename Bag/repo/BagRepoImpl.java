package com.xworkz.bag.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.bag.dto.BagDto;
import com.xworkz.bag.sqlcredential.SqlcCredential;

public class BagRepoImpl implements BagRepo {

	@Override
	public boolean save(BagDto dto) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection connection =	DriverManager.getConnection(SqlcCredential.URL.getValue(),SqlcCredential.USERNAME.getValue(),SqlcCredential.PASSWORD.getValue());
			
		String query = "INSERT INTO bag VALUES(?,?,?,?,?)";
			
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1,dto.getId());
		statement.setString(2, dto.getBrandName());
		statement.setString(3, dto.getColor());	
		statement.setInt(4, dto.getCapacity());
		statement.setInt(5, dto.getPrice());
		
		statement.executeUpdate();
		
		statement.close();
		connection.close();
			
			
			
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
			return true;
	}

	@Override
	public BagDto findByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(SqlcCredential.URL.getValue(),SqlcCredential.USERNAME.getValue(),
					SqlcCredential.PASSWORD.getValue());
			
			String query = "SELECT * fROM bag where brandName=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setString(1, name);
			
			ResultSet data = statement.executeQuery();
		
			while (data.next()) {
			  int id = data.getInt("id");
			  String brandName =data.getString("brandName");
			  String color = data.getString("color");
			  int capacity = data.getInt("capacity");
			  int price = data.getInt("price");
			  
			  BagDto dto = new BagDto(id,brandName,color,capacity,price);
			  return dto;
				
			}
			
			statement.close();
			connection.close();
			
			
			
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
	public BagDto FindByNameAndId(String name, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(SqlcCredential.URL.getValue(),SqlcCredential.USERNAME.getValue(),
					SqlcCredential.PASSWORD.getValue());	
			
			String query = "SELECT * fROM bag where brandName=? and id=?";
			
			PreparedStatement ststement = connection.prepareStatement(query);
			
			ststement.setString(1, name);
			
			ststement.setInt(2, id);
			
			ResultSet set = ststement.executeQuery();
			
			while(set.next()) {
				
				int Id = set.getInt("id");
				String brandname = set.getString("brandname");
				String color = set.getString("color");
				int capacity = set.getInt("capacity");
				int price = set.getInt("price");
				
				BagDto dto = new BagDto(Id, brandname, color, capacity, price);
				return dto;
			}
			
			ststement.close();
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			return null;
	}
	
}
