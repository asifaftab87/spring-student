package org.la.student.kayes.methods;

public class Employee {
	private int id;
	private String name;
	private int empNum;
	private String dateHired;
	private int cityId;
	
	public int getId() 
	   {
			return id;
	   }
	public void setId(int n)
	{
		id=n;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String nam)
	{
		name=nam;
	}
	
	public int getempNum() 
	   {
			return empNum;
	   }
	public void setempNum(int emp)
	{
		empNum=emp;
	}
	
	public String getdate()
	{
		return dateHired;
	}
	public void setdate(String date)
	{
		dateHired=date;
	}
	
	public int getcity() 
	   {
			return cityId;
	   }
	public void setcity(int city)
	{
		cityId=city;
	}

}
