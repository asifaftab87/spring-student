package org.la.student.noor;

public class PresentationMain {

	public static void main(String[] args) {
		Presentation pres=new Presentation();
		pres.setPresentationId(1);
		pres.setBookedCompanyId(2);
		pres.setBookedRoomId(10);
		pres.setStartTime(11.30);
		pres.setEndTime(12.30);
		
		//pres.display();
		
		int presentationId=pres.getPresentationId();
		int bookedCompanyId=pres.getBookedCompanyId();
		int bookedRoomId=pres.getBookedRoomId();
		double startTime=pres.getStartTime();
		double endTime=pres.getEndTime();

		System.out.println("presentationId:" +pres.getPresentationId());
		System.out.println("bookedCompanyId:" +pres.getBookedCompanyId());
		System.out.println("bookedRoomId:" +pres.getBookedRoomId());
		System.out.println("startTime:" +pres.getStartTime());
		System.out.println("endTime:" + pres.getEndTime());
		
	}

	}
