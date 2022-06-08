package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DoubtServlet")
public class DoubtServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n1=request.getParameter("n1");
		String n2=request.getParameter("n2");
		System.out.println(n1);
		System.out.println(n2);
		
		
		int number1=Integer.parseInt(n1);
		int number2=Integer.parseInt(n2);
		
		response.setContentType("text/html");
		
		try
		{
			PrintWriter out=response.getWriter();
			out.print("<html><body>");
			
			out.print("Number1: "+n1 +"<br>");
			out.print("Number2: "+n2 +"<br>");
			
			out.print("Addition Of two Numbers is: "+"<b>"+(number1+number2)+"<br>"+"<br>");
			out.print("Addition Successfully!!! ");
			
			
			
			out.print("</html></body>");
			
			
		}
		catch(Exception e)
		{
			
		}

	}

}
