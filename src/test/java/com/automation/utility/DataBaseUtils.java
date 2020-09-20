package com.automation.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseUtils {

	static String url = PropertyReader.getProperty("db.url");
	static String username = PropertyReader.getProperty("db.username");
	static String pass = PropertyReader.getProperty("db.password");

	static Connection con;

	public static void connectDataBase() {

		try {
			// 1. Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 1. Create Connection
			con = DriverManager.getConnection(url, username, pass);
			System.out.println("Connection successful...");
		} catch (Exception e) {

		}
	}

	public static ResultSet getData(String query) {
		ResultSet result = null;
		try {
			Statement st = con.createStatement();
			result = st.executeQuery(query);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
