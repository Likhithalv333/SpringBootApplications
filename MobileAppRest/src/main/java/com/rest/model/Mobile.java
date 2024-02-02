package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	private String cname;
	private long mobileNo;
	private String proNmae;
	private int quantity;
	private double total;
	private  double dis;
	private double gst_amt;
	private double invoice_bill;
	private double price;
	public Mobile() {
		// TODO Auto-generated constructor stub
	super();
	}
	public Mobile(int cid, String cname, long mobileNo, String proNmae, int quantity, double total, double dis,
			double gst_amt, double invoice_bill,double price) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobileNo = mobileNo;
		this.proNmae = proNmae;
		this.quantity = quantity;
		this.total = total;
		this.dis = dis;
		this.gst_amt = gst_amt;
		this.invoice_bill = invoice_bill;
		this.price=price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getProNmae() {
		return proNmae;
	}
	public void setProNmae(String proNmae) {
		this.proNmae = proNmae;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDis() {
		return dis;
	}
	public void setDis(double dis) {
		 this.dis = dis;
	}
	public double getGst_amt() {
		return gst_amt;
	}
	public void setGst_amt(double gst_amt) {
		this.gst_amt = gst_amt;
	}
	public double getInvoice_bill() {
		return invoice_bill;
	}
	public void setInvoice_bill(double invoice_bill) {
		this.invoice_bill = invoice_bill;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [cid=" + cid + ", cname=" + cname + ", mobileNo=" + mobileNo + ", proNmae=" + proNmae
				+ ", quantity=" + quantity + ", total=" + total + ", dis=" + dis + ", gst_amt=" + gst_amt
				+ ", invoice_bill=" + invoice_bill + ",price"+price+"]";
	}
	
}
