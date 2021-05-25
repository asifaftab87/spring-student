package org.la.student.tahir.jdbc.model;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = -8545901547885450379L;
	
	private int id,  cityId , employeeNum ;
	private String employeeName, dateHired;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeNum() {
		return employeeNum;
	}
	public void setEmployeeNum(int employeeNum) {
		this.employeeNum = employeeNum;
	}
	public String getDateHired() {
		return dateHired;
	}
	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", cityId=" + cityId + ", employeeName=" + employeeName + ", employeeNum="
				+ employeeNum + ", dateHired=" + dateHired + "]";
	}
	
	
}

