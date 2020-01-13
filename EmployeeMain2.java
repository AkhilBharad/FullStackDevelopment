package com.cts.activity.main;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.io.FileNotFoundException;

public class EmployeeMain2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		Scanner sc =new Scanner(System.in);
	System.out.println("Enter id");
	int id=Integer.parseInt(sc.nextLine());
	System.out.println("Enter name");
		String name=sc.nextLine();
	System.out.println("Enter age");
	int age=Integer.parseInt(sc.nextLine());
	System.out.println("Enter phone no");
	Long phone=Long.parseLong(sc.nextLine());
	System.out.println("Enter dept");
	String dept=sc.nextLine();
	System.out.println("Enter loc");
	String loc=sc.nextLine();
	
		
		
		

		Class.forName("com.mysql.jdbc.Driver");

		String url = "jdbc:mysql://localhost:3306/cts";
		String username = "root";
		String password = "admin";
        Connection conn=DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
//String query = "insert into employee values(105,'sai krishna',20,77822,'CSE','Hyderabad')";
		//String query = "update employee set empName='Akhil' where empId=105";
		
		//String query="select * from employee";
		//ResultSet rs=stmt.executeQuery(query);
		//while(rs.next()) {
			
		//	System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+
		//	rs.getLong(4)+":"+rs.getString(5)+":"+rs.getString(6));
		//}
		
		
		String query="insert into employee values(?,?,?,?,?,?)";
		java.sql.PreparedStatement ps=conn.prepareStatement(query);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setInt(3, age);
		ps.setLong(4, phone);
		ps.setString(5, dept);
		ps.setString(6, loc);
		
		
		
		
		
		int result = ps.executeUpdate(query);

		if (result > 0) {
			System.out.println("Data inserted successfully");
		} else {
			System.out.println("TRy again");
		}
		System.out.println("Connection Established");
	}

}
