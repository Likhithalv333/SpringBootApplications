package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_")
public class Employee {
		@Id
		private int  empId;
		private String empName;
		private String desg;
		private String email;
		private long mobileNo;
		private String  gender;
		private String city;
		private String State;
		private String country;
		private String address;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int empId, String empName, String desg, String email, long mobileNo, String gender, String city,
				String state, String country, String address) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.desg = desg;
			this.email = email;
			this.mobileNo = mobileNo;
			this.gender = gender;
			this.city = city;
			State = state;
			this.country = country;
			this.address = address;
		}
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDesg() {
			return desg;
		}
		public void setDesg(String desg) {
			this.desg = desg;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(long mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return State;
		}
		public void setState(String state) {
			State = state;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", desg=" + desg + ", email=" + email
					+ ", mobileNo=" + mobileNo + ", gender=" + gender + ", city=" + city + ", State=" + State
					+ ", country=" + country + ", address=" + address + "]";
		}
		
		
}
