package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie c=new Cookie("userId","");
		response.addCookie(c);
		System.out.println("This is userId:"+c);
		
		response.sendRedirect("Login.jsp");
		
		
	}

}
