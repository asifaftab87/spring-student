package org.la.student.kayes.methods;

public class Presentation {
	private int presentationId;
	private int bookedcompanyId;
	private int bookedRoomId;
	private String startTime;
	private String endTime;
	
	
	
	
	public int getpresId()
	{
		return presentationId;
	}
	public int getId()
	{
		
		return bookedcompanyId;
	}
	public int getbookId()
	{
		return bookedRoomId;
	}
	public String getstart()
	{
		return startTime;
	}
	public String getend()
	{
		return endTime;
	}
	
	
	
	public void setpresId(int i)
	{
		presentationId=i;
	}
	
	public void setId(int j)
	{
		bookedcompanyId=j;
	}
	public void setbookId(int k)
	{
		bookedRoomId=k;
	}
	public void setstart(String s)
	{
		startTime=s;
	}
	public void setend(String e)
	{
		endTime=e;
	}
	

}
