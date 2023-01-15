package com.xworkz.freez.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.freez.constants.SqlCredentials;

public class DButils {

	public static Connection getconnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			return connection;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
