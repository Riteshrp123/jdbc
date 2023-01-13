package com.xworkx.shirt.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkx.shirt.dto.ShirtDto;
import com.xworkx.shirt.util.DButil;

public class ShirtRepoImpl implements ShirtRepo {

	
	@Override
	public boolean save(ShirtDto dto) {
	   
		String query = "Insert into shirt values(?,?,?,?,?)";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1,dto.getId());
			statement.setString(2, dto.getBrandName());
			statement.setString(3, dto.getColor());
			statement.setInt(4, dto.getSize());
			statement.setBoolean(5, dto.isHasPacket());
			
			statement.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public List<ShirtDto> read() {
		
		
		    String query = "SELECT * FROM  shirt";
		

		    try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
		
			ResultSet set = statement.executeQuery();
			
			List<ShirtDto> list = new ArrayList<ShirtDto>();
			
			while(set.next()) {
				int id = set.getInt(1);
				String brandName = set.getString(2);
				String color = set.getString(3);
				int size = set.getInt(4);
				boolean hasPacket = set.getBoolean(5);
				
				ShirtDto dto = new ShirtDto(id, brandName, color, size, hasPacket);
				list.add(dto);
			}
			
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

	@Override
	public ShirtDto findByNameAndId(String brandName, int id) {
		
		String query = "SELECT * fROM shirt where brandName=? and id=?";
		
		
		           try(Connection connection = DButil.getConnection();
			        	PreparedStatement statement = connection.prepareStatement(query);) {
			
			        statement.setString(1, brandName);
		            statement.setInt(2, id);
			
			        ResultSet set = statement.executeQuery();
			
				    set.next(); 
					int id1 = set.getInt(1);
					String brandName1 = set.getString(2);
					String color = set.getString(3);
					int size = set.getInt(4);
					boolean hasPacket = set.getBoolean(5);
					
					ShirtDto dto = new ShirtDto(id1, brandName1, color, size, hasPacket);
				    return dto;
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean updateSizeByName(int size, String brandName) {
		
		String query ="update shirt set size=? where brandName=?";
		
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, size);
			statement.setString(2, brandName);
			
		    statement.executeUpdate();
			
		    return true;
				    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
		
	}

	@Override
	public boolean deletByColor(String color) {
		
		String query = "delete from shirt where color=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, color);
			
		    statement.executeUpdate();
			
		    return true;
				    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}

	@Override
	public boolean deleteBySizeAndName(int size, String brandName) {

		
		String query = "delete from shirt where size=? and brandName=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, size);
			statement.setString(2, brandName);
			
		    statement.executeUpdate();
			
		    return true;
				    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	}

