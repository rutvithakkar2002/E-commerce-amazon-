package com.dao;

import java.util.ArrayList;

import com.bean.ProductBean;

public class ProductDao {

	public static ArrayList<ProductBean> products = new ArrayList<ProductBean>();
	
/*	static {
		ProductBean p1 = new ProductBean();
		p1.setProductcategory("phone");
		p1.setProductname("iphone 12");
		p1.setProductprice(65000);
		p1.setProductqty(100);

		ProductBean p2 = new ProductBean();
		p2.setProductcategory("phone");
		p2.setProductname("iphone 13");
		p2.setProductprice(85000);
		p2.setProductqty(50);

		ProductBean p3 = new ProductBean();
		p3.setProductcategory("phone");
		p3.setProductname("samsung galaxy 12");
		p3.setProductprice(45000);
		p3.setProductqty(50);

		ProductBean p4 = new ProductBean();
		p4.setProductcategory("phone");
		p4.setProductname("realme 2 pro");
		p4.setProductprice(13000);
		p4.setProductqty(50);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
	}
	*/
	public void addProduct(ProductBean product) {
		this.products.add(product);
	}
	public ArrayList<ProductBean> getAllProducts() {
		return this.products;
	}
}
