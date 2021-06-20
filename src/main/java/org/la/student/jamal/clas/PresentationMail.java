package org.la.student.jamal.clas;

public class PresentationMail {

	public static void main(String[] args) {
		
		
		Presentation presentation =new Presentation();
		presentation.setName("Jamal");
		presentation.setPresentationId(978);
		presentation.setBookedCompanyId(0125);
		presentation.setBookedRoomId(1303);
		presentation.setStartTime("13:10");
		presentation.setEndTime("14:10");
		
		presentation.display();
		System.out.println();
		
		presentation.setName("Daniella");
		presentation.setPresentationId(4503);
		presentation.setBookedCompanyId(9913);
		presentation.setBookedRoomId(1011);
		presentation.setStartTime("14:20");
		presentation.setEndTime("15:20");

		
		presentation.display();
	}

}
