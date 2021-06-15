package org.la.student.barry.clas.task;

public class PresentationMain {

	public static void main(String[] args) {
		 Presentation presentation = new Presentation();
		 presentation.setPresentationId(5);
		 presentation.setBookedCompanyId(10);
		 presentation.setBookedRoomId(7);
		 presentation.setStartTime("11 am");
		 presentation.setEndTime("1 pm");
		 
		 presentation.display();
		 
		 int presentationId = presentation.getPresentationId();
		 int bookedCompanyId= presentation.getBookedCompanyId();
		 int bookedRoomId= presentation.getBookedRoomId();
		 String startTime= presentation.getStartTime();
		 String endTime= presentation.getEndTime();
		 System.out.println("------End----------");
		 System.out.println("PresentationId: " +presentationId);
		 System.out.println("BookedCompanyId: " +bookedCompanyId);
		 System.out.println("BookedRoomId: " +bookedRoomId);
		 System.out.println("StartTime:"+ startTime);
		 System.out.println("EndTime :" + endTime);
		 

	}

}
