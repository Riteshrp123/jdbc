package com.xworkz.watch.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.watch.constants.SqlCredential;


public class DButils {
	
	public static   Connection getConnection(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection =	DriverManager.getConnection(SqlCredential.URL.getValue()
					,SqlCredential.USERNAME.getValue(),SqlCredential.PASSWORD.getValue());
			
			return connection;
			
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
