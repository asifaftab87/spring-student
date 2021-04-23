package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.PresentationAttendance;
import org.la.student.tahir.jdbc.repository.PresentationAttendanceRepository;

public class PresentationAttendanceService {

	
	public PresentationAttendanceService(){
		
		PresentationAttendanceRepository.connectionOpen();
	}
	
	public static List<PresentationAttendance> findAll(){
		
		List<PresentationAttendance> ptlist = PresentationAttendanceRepository.findAll();
		
		return ptlist;
	}
	
	public static PresentationAttendance findByTicketId(int ticketId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByTicketId(ticketId);
		
		return ptAtt;
	}
	

	public static PresentationAttendance findByPresentationId(int presentationId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByPresentationId(presentationId);
		
		return ptAtt;
	}
	

	public static PresentationAttendance findByAttendeeId(int attendeeId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByAttendeeId(attendeeId);
		
		return ptAtt;
	}
	

	public static void create(PresentationAttendance pt) {
	
		PresentationAttendanceRepository.create(pt);
}
	public static void update() {
		
		PresentationAttendanceRepository.update();
		
		PresentationAttendance pt = new PresentationAttendance();
		
		pt.getTicketId();
		pt.getPresentationId();
		pt.getAttendeeId();
	}
}
