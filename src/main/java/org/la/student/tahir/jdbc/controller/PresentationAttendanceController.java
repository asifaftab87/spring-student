package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.PresentationAttendance;
import org.la.student.tahir.jdbc.repository.PresentationAttendanceRepository;
import org.la.student.tahir.jdbc.service.PresentationAttendanceService;

public class PresentationAttendanceController {


	PresentationAttendanceService ptservice = null;
	
	 PresentationAttendanceController(){
		
		ptservice = new PresentationAttendanceService();
		
	}
	public static void main(String[] args) {
		
		PresentationAttendanceController  PACntrl = new PresentationAttendanceController();
		
		PACntrl.addPAttendance();
	}
	
	void findAll(){
		
		List<PresentationAttendance> ptlist = PresentationAttendanceRepository.findAll();
		System.out.println(ptlist);
		
	}
	
	void findByTicketId(int ticketId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByTicketId(ticketId);
		
		System.out.println(ptAtt);
	}
	

	void findByPresentationId(int presentationId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByPresentationId(presentationId);
		
		System.out.println(ptAtt);
	}
	

	void findByAttendeeId(int attendeeId){
		
		PresentationAttendance ptAtt = PresentationAttendanceRepository.findByAttendeeId(attendeeId);
		
		System.out.println(ptAtt);
	}
	

	void addPAttendance() {
		
		PresentationAttendance PAttendance = new PresentationAttendance();
		
		PAttendance.setTicketId(11);
		PAttendance.setPresentationId(21);
		PAttendance.setAttendeeId(31);
		
		PresentationAttendanceService.create(PAttendance);
		
		
	}

}
