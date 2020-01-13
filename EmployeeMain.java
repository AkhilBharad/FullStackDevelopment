package com.cts.activity.main;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.io.FileNotFoundException;

public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password = "admin";
        Connection conn=DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
		String query = "insert into employee values(105,'sai krishna',20,77822,'CSE','Hyderabad')";
		int result = stmt.executeUpdate(query);

		if (result > 0) {
			System.out.println("Data inserted successfully");
		} else {
			System.out.println("TRy again");
		}
		System.out.println("Connection Established");
	}

}
