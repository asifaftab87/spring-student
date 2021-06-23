package org.la.student.kayes.methods;

public class Attendee {
private int attendeeId;
private String Fname;
private String lname;
private String Phone;
private String Email;


public int getattendeeId() 
   {
		return attendeeId;
   }
public void setattendeeId(int n)
{
	attendeeId=n;
}

public String getFname()
{
	return Fname;
}
public void setFname(String fname)
{
	Fname=fname;
}

public String getLname()
{
	return lname;
}
public void setlname(String last)
{
	lname=last;
}

public String getphone()
{
	return Phone;
}
public void setphone(String phone)
{
	Phone=phone;
}

public String getEmail()
{
	return Email;
}
public void setEmail(String mail)
{
	Email=mail;
}
}

