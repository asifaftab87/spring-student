package org.la.student.abdullahi.methods.setters.getters;

public class PresentationMain {


	public static void main(String[] args) {
		
		Presentation presentation= new Presentation();
		presentation.setPresentationId(1);
		presentation.setCompanyId(" 12");
		presentation.setRoomId(" R12");
		presentation.setStartTime(" 5:30pm");
		presentation.setEndTime(" 7:00pm");
		
		
		
		int PresentationId= presentation.getPresentationId();
		String BookedCompanyId= presentation.getCompanyId();
		String BookedRoomId= presentation.getRoomId();
		String StartTime = presentation.getStartTime();
		String EndTime = presentation.getEndTime();
		
		System.out.println(" Presentation Id = "+PresentationId);
		System.out.println(" Booked Company Id = "+BookedCompanyId);
		System.out.println(" Booked Room Id = "+BookedRoomId);
		System.out.println(" Start Time = "+StartTime);
		System.out.println(" End Time = "+EndTime);
		
	}
}