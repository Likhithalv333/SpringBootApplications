package com.rest.model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int proId;
	private String proName;
	private String proType;
	private String productCategory;
	private double proPrice;

	@Embedded
	 private Charges charge;
	private double finalPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int proId, String proName,String proType, String productCategory, double proPrice, Charges charge,double finalPrice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proType=proType;
		this.productCategory = productCategory;
		this.proPrice = proPrice;
		this.charge = charge;
		this.finalPrice=finalPrice;
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}
	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	public double getProPrice() {
		return proPrice;
	}

	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}

	public Charges getCharge() {
		return charge;
	}

	public void setCharge(Charges calculation) {
		this.charge = calculation;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName +",proType"+proType+ ", productCategory=" + productCategory + ", proPrice="
				+ proPrice + ", charge=" + charge +",finalPrice="+finalPrice+ "]";
	}

	
	 
}
