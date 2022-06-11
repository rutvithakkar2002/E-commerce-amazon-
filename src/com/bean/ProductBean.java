package com.bean;

public class ProductBean {

	private int productId;
	private String productname;
	private int productprice;
	private int productqty;
	private String productcategory;

	public ProductBean() {
		this.productId = (int) (Math.random() * 1000000000);
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	public int getProductqty() {
		return productqty;
	}

	public void setProductqty(int productqty) {
		this.productqty = productqty;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	
}
