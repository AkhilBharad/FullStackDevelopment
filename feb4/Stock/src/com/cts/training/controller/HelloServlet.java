package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		
		PrintWriter out=response.getWriter();
		out.println("Hello to servlet");
		String username=request.getParameter("user");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String password=request.getParameter("pass");
		String repassword=request.getParameter("repass");
		
		out.println("Username:"+username);
		out.println("Phone Number:"+phone);
		out.println("Email:"+email);
		out.println("Password:"+password);
		out.println("Re-Entered Password:"+repassword);
	
	}
	

}
