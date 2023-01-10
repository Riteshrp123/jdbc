package com.xworkz.tree.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo {
	

	@Override
	public boolean save(TreeDto dto) {
		String userName="root";
		String password="Xworkzodc@123";
		String host="jdbc:mysql://localhost:3306/ritesh";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, userName, password);
			
			String query = "INSERT INTO  VALUES(?,?,?,?,?)";
					
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 1);
			statement.setString(2, "Mango");
			statement.setString(3, "Green");
			statement.setString(4, "Food");
			statement.setBoolean(5, true);
			
			statement.setInt(1,2);
			statement.setString(2, "Banana");
			statement.setString(3, "Yellow");
			statement.setString(4, "Food");
			statement.setBoolean(5, true);
			
			statement.setInt(1,3);
			statement.setString(2, "Peepal");
			statement.setString(3, "Green");
			statement.setString(4, "Wood");
			statement.setBoolean(5, true);
			
			statement.setInt(1,4);
			statement.setString(2, "Rainbow Eucalyptus");
			statement.setString(3, "Rainbow");
			statement.setString(4, "Show");
			statement.setBoolean(5, true);
			
			statement.setInt(1,5);
			statement.setString(2, "Black Tupelo");
			statement.setString(3, "Red");
			statement.setString(4, "Nature");
			statement.setBoolean(5, true);
			
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
	public TreeDto read() {
		String userName="root";
		String password="Xworkzodc@123";
		String host="jdbc:mysql://localhost:3306/ritesh";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection connection = DriverManager.getConnection(host, userName, password);	
			
			String query ="SELECT * FROM Tree1 where id=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 1);
			
			
			ResultSet set = statement.executeQuery();
			set.next();
			int id = set.getInt(1); 
			String name = set.getString("name");
			String color = set.getString("color");
			String type = set.getString("type");			
			boolean giveFood = set.getBoolean("giveFood");
			
			System.out.println(id);
			System.out.println(name);
			System.out.println(color);
			System.out.println(type);
			System.out.println(giveFood);
			
			
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
