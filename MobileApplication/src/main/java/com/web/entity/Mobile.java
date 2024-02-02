package com.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile_")
public class Mobile {
    @Id
	private String modelName;
    @Column(name="m_name")
    private String mobile_Name;
    private String company_Name;
    private int ram;
    private int rom;
    private String os_Name;
    private String processer_name;
    private String f_cam;
    private String b_cam;
    @Column(name="m_price")
    private double price;
    private String imei_no;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String modelName, String mobile_Name, String company_Name, int ram, int rom, String os_Name,
			String processer_name, String f_cam, String b_cam, double price, String imei_no) {
		super();
		this.modelName = modelName;
		this.mobile_Name = mobile_Name;
		this.company_Name = company_Name;
		this.ram = ram;
		this.rom = rom;
		this.os_Name = os_Name;
		this.processer_name = processer_name;
		this.f_cam = f_cam;
		this.b_cam = b_cam;
		this.price = price;
		this.imei_no = imei_no;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getMobile_Name() {
		return mobile_Name;
	}
	public void setMobile_Name(String mobile_Name) {
		this.mobile_Name = mobile_Name;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getOs_Name() {
		return os_Name;
	}
	public void setOs_Name(String os_Name) {
		this.os_Name = os_Name;
	}
	public String getProcesser_name() {
		return processer_name;
	}
	public void setProcesser_name(String processer_name) {
		this.processer_name = processer_name;
	}
	public String getF_cam() {
		return f_cam;
	}
	public void setF_cam(String f_cam) {
		this.f_cam = f_cam;
	}
	public String getB_cam() {
		return b_cam;
	}
	public void setB_cam(String b_cam) {
		this.b_cam = b_cam;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImei_no() {
		return imei_no;
	}
	public void setImei_no(String imei_no) {
		this.imei_no = imei_no;
	}
	@Override
	public String toString() {
		return "Mobile [modelName=" + modelName + ", mobile_Name=" + mobile_Name + ", company_Name=" + company_Name
				+ ", ram=" + ram + ", rom=" + rom + ", os_Name=" + os_Name + ", processer_name=" + processer_name
				+ ", f_cam=" + f_cam + ", b_cam=" + b_cam + ", price=" + price + ", imei_no=" + imei_no + "]";
	}
    
}