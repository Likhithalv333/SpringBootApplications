package com.rest.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Charges {
	private double discount;
	private  double gst;
	private double dileveryCharges;
	public Charges() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Charges(double discount, double gst, double dileveryCharges) {
		super();
		this.discount = discount;
		this.gst = gst;
		this.dileveryCharges = dileveryCharges;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDileveryCharges() {
		return dileveryCharges;
	}
	public void setDileveryCharges(double dileveryCharges) {
		this.dileveryCharges = dileveryCharges;
	}
	@Override
	public String toString() {
		return "Charges [proCategory=" + ", discount=" + discount + ", gst=" + gst + ", dileveryCharges="
				+ dileveryCharges + "]";
	}
}
