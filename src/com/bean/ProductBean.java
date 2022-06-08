package com.bean;

public class ProductBean {

	private int productId;
	private String productname; 
	private String productprice;
	private String productqty;
	private String productcategory;
	
	
	public ProductBean(){
		this.productId = (int)(Math.random()*1000000000);
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
	
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductqty() {
		return productqty;
	}
	public void setProductqty(String productqty) {
		this.productqty = productqty;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	
}
