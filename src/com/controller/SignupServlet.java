package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{

		@Override
		protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String firstName=request.getParameter("firstName");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			String gender=request.getParameter("gender");
			
			UserBean user=new UserBean();
		
			user.setFirstName(firstName);
			user.setEmail(email);
			user.setPassword(password);
			user.setGender(gender);
			
			UserDao userDao=new UserDao();
			userDao.addUser(user);
			
			response.sendRedirect("Login.jsp");
			
		}
}
