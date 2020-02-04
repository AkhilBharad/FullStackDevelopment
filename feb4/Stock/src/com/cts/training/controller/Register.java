package com.cts.training.controller;

import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("userName");
		String password = request.getParameter("userPass");
		String password1 = request.getParameter("userPass1");
		String email = request.getParameter("userEmail");
		int phone = Integer.parseInt(request.getParameter("phone"));

		try {
			Class.forName("mysql.jdbc.driver.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts", "root", "admin");

			PreparedStatement ps = con.prepareStatement("insert into registeruser values(?,?,?,?)");

			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, email);
			ps.setInt(4, phone);

			int i = ps.executeUpdate();
			if (i > 0)
				out.print("You are successfully registered...");

		} catch (Exception e2) {
			System.out.println(e2);
		}

		out.close();
	}

}