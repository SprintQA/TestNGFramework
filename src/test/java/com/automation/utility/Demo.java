package com.automation.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws Exception {

		// Information required to access database
		String url = "jdbc:mysql://mydbinstance1.cvmcihhikg4z.us-east-2.rds.amazonaws.com:3306/company";
		String username = "SprintQA";
		String pass = "sprintqa123";

		// **************************CONNECT*****************************

			// 1. Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 1. Create Connection
			Connection con = DriverManager.getConnection(url, username, pass);
			System.out.println("Connection successful...");

		// **************************Query*****************************
			
			// 2. Create Statements
			Statement st = con.createStatement();
		
			// 2. Execute Query
			ResultSet result = st.executeQuery("select first_name, name as proj_name from employees natural join projects;");
			
		// **************************Printing Result*****************************
			
			while(result.next()) {
				System.out.println(result.getString("first_name"));
				System.out.println("    "+result.getString("proj_name"));
				System.out.println();
			}
			
		// **************************Close Connection*****************************
			st.close();
			con.close();
			
	}
}
