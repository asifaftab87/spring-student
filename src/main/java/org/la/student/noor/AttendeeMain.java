package org.la.student.noor;

public class AttendeeMain {

	public static void main(String[] args) {
		Attendee att=new Attendee();
		att.setattendeeId(11);
		att.setfirstName("Noor");
		att.setlastName("Shaikh");
		att.setphone("9922445564");
		att.setemail("ns@gmail.com");
		att.setvip("Yes");
		
		//att.display();
		
		int attendeeId=att.getattendeeId();
		String firstname=att.getfirstName();
		String lastname=att.getlastName();
		String phone=att.getphone();
		String email=att.getemail();
		String vip=att.getvip();
		
		System.out.println("attendeeId:" +att.getattendeeId());
		System.out.println("firstName:" +att.getfirstName());
		System.out.println("lastName:" +att.getlastName());
		System.out.println("phone:" +att.getphone());
		System.out.println("email:" +att.getemail());
		System.out.println("vip:" +att.getvip());
	}


}
