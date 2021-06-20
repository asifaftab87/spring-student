package org.la.student.barry.clas.task;

public class AttendeeMain {

	public static void main(String[] args) {

   Attendee attendee= new Attendee();
   attendee.setAttendeeId(200232);
   attendee.setPhone(182516765);
   attendee.setFirstName("Muhamad");
   attendee.setLastName("Barry");
   attendee.setEmail("barryelhadjabdoula@gmail.com");
   attendee.setVip("Good quality");

   // attendee.display();
    
    int   attendeeId= attendee.getAttendeeId();
    String firstName= attendee.getFirstName();
    String lastName= attendee.getLastName();
    String email = attendee.getEmail();
    String vip = attendee.getVip();
    int phone = attendee.getPhone();
    System.out.println("...........By using Getter .......");
    System.out.println("AttendeeId:" + attendeeId);
    System.out.println("FirstName: " + firstName);
    System.out.println("LastName: "+ lastName);
    System.out.println("Email: " + email);
    System.out.println("Vip : "+ vip);
    System.out.println("Phone: "+phone);
    
    
   
	}

}
