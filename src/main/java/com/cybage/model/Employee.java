package com.cybage.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "\"Employees\"")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "\"empCode\"")
	private long empCode;

	@Column(name = "\"empName\"")
	private String empName;

	@Column(name = "\"loginName\"")
	private String loginName;

	@Column(name = "\"joinDate\"")
	private Date joinDate;

	@Column(name = "\"empPlanLeave\"")
	private int empPlanLeave;
	
	@Column(name = "\"empUnplanLeave\"")
	private int empUnplanLeave;
	
	@Column(name = "\"empFH\"")
	private int empFH;
	
	@Column(name = "\"first_swipe\"")
	private int firstSwipe;
	
	@Column(name = "\"latest_swipe\"")
	private int latestSwipe;

	public long getEmpCode() {
		return empCode;
	}

	public void setEmpCode(long empCode) {
		this.empCode = empCode;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public int getEmpPlanLeave() {
		return empPlanLeave;
	}

	public void setEmpPlanLeave(int empPlanLeave) {
		this.empPlanLeave = empPlanLeave;
	}

	public int getEmpUnplanLeave() {
		return empUnplanLeave;
	}

	public void setEmpUnplanLeave(int empUnplanLeave) {
		this.empUnplanLeave = empUnplanLeave;
	}

	public int getEmpFH() {
		return empFH;
	}

	public void setEmpFH(int empFH) {
		this.empFH = empFH;
	}

	public int getFirstSwipe() {
		return firstSwipe;
	}

	public void setFirstSwipe(int firstSwipe) {
		this.firstSwipe = firstSwipe;
	}

	public int getLatestSwipe() {
		return latestSwipe;
	}

	public void setLatestSwipe(int latestSwipe) {
		this.latestSwipe = latestSwipe;
	}
}
