package com.lti.demo;

public class Product {
	int prdId;
	String prdName;
	int prdCost;
	
	public Product() {
		super();
	}

	public Product(int prdId, String prdName, int prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(int prdCost) {
		this.prdCost = prdCost;
	}

	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", prdCost=" + prdCost + "]";
	}
	
	
	
	
	

}
