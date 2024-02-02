package com.web.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_")
public class Student {
	@Id
	private String stdRollNo;
	private String name;
	private String course;
	private int hibernate;
	private int spring;
	private int springBoot;
	private int total;
	private double percentage;
	private String grade;
	private String result;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String stdRollNo, String name, String course, int hibernate, int spring, int springBoot, int total,
			double percentage, String grade, String result) {
		super();
		this.stdRollNo = stdRollNo;
		this.name = name;
		this.course = course;
		this.hibernate = hibernate;
		this.spring = spring;
		this.springBoot = springBoot;
		this.total = total;
		this.percentage = percentage;
		this.grade = grade;
		this.result = result;
	}
	public String getStdRollNo() {
	    return stdRollNo;
	}

	
	public void setStdRollNo(String stdRollNo) {
		this.stdRollNo = stdRollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getHibernate() {
		return hibernate;
	}
	public void setHibernate(int hibernate) {
		this.hibernate = hibernate;
	}
	public int getSpring() {
		return spring;
	}
	public void setSpring(int spring) {
		this.spring = spring;
	}
	public int getSpringBoot() {
		return springBoot;
	}
	public void setSpringBoot(int springBoot) {
		this.springBoot = springBoot;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [stdRollNo=" + stdRollNo + ", name=" + name + ", course=" + course + ", hibernate=" + hibernate
				+ ", spring=" + spring + ", springBoot=" + springBoot + ", total=" + total + ", percentage="
				+ percentage + ", grade=" + grade + ", result=" + result + "]";
	}
	
	
}
