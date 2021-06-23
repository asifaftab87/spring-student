package org.la.student.bakil.objects;

public class AttendeeMain {

	public static void main(String[] args) {
		
		
		Attendee attendee = new Attendee () ;
			
		attendee.setfirstName("Bakil");
		attendee.setlastName("Alkhaledi");
		attendee.setphone("01137737549");
		attendee.setemail("Allembey-2013@hotmail.com");
		attendee.setvip("VIP 122");
		
		String firstName=attendee.getfirstName();
		String lastName = attendee.getlastName();
		String phone = attendee.getphone();
		String email =attendee.getemail();
		String vip = attendee.getvip();
		
		System.out.println("Fisrt name :"+firstName);
		System.out.println("Last name :"+lastName);
		System.out.println("Phone number :"+phone);
		System.out.println("Email :"+email);
		System.out.println("Vip :"+vip);
				
		

	}

}
