package com.xworkz.shoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ShoesRunner {

	public static void main(String[] args) {
		
		String userName="root";
		String password="Xworkzodc@123";
		String host="jdbc:mysql://localhost:3306/sep_08";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host,userName,password);
			
			String query =" INSERT INTO shoes values(?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 2);
			statement.setString(2, "ADIDAS");
			statement.setInt(3, 2000);
			statement.setString(4,"RED");
			statement.setString(5, "CASUAL");
			
			statement.setInt(1, 3);
			statement.setString(2, "WILDCRAFT");
			statement.setInt(3, 1000);
			statement.setString(4, "BLACK");
			statement.setString(5, "RUNNING");
			
			statement.setInt(1, 4);
			statement.setString(2, "BATA");
			statement.setInt(3, 1200);
			statement.setString(4, "WHITE");
			statement.setString(5, "SLIPER");
			
			statement.setInt(1, 5);
			statement.setString(2, "NIKE");
			statement.setInt(3, 3000);
			statement.setString(4, "GRAY");
			statement.setString(5, "CASUAL");
			
			statement.executeUpdate();
			
			
			statement.close();
			connection.close();

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
