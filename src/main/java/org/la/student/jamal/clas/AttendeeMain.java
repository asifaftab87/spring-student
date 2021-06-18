package org.la.student.jamal.clas;

public class AttendeeMain {

	public static void main(String[] args) {
		
		Attendee attendee=new Attendee();
		
		attendee.setAttendeeId(11002233);
		attendee.setFirstName("Jamal");
		attendee.setLastName("Alkatheeri");
		attendee.setPhone(932508355);
		attendee.setEmail("al-katheeri@hotmail.com");
		attendee.setVip("Yes");
		
		attendee.display();

	}

}
