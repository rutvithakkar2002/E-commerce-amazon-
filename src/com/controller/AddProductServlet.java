package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productname = request.getParameter("productname");
		int productqty = Integer.parseInt(request.getParameter("productqty"));
		int productprice = Integer.parseInt(request.getParameter("productprice"));
		String productcategory = request.getParameter("productcategory");

		ProductBean product = new ProductBean();
		product.setProductname(productname);
		product.setProductqty(productqty);
		product.setProductprice(productprice);
		product.setProductcategory(productcategory);

		ProductDao productDao = new ProductDao();
		productDao.addProduct(product);

		RequestDispatcher rd = request.getRequestDispatcher("ListInfo.jsp");
		rd.forward(request, response);

	}

}
