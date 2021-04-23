package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.Presentation;
//import org.la.student.tahir.jdbc.repository.PresentationRepository;
import org.la.student.tahir.jdbc.service.PresentationService;

public class PresentationController {

	PresentationService pService = null;
	
	public PresentationController() {
		
		pService = new PresentationService();
	}
	
	public static void main(String[] args) {
		
		PresentationController pContrl = new PresentationController();
		
		//pContrl.addPresentation();
		pContrl.findByPresentationId(1);
		//pContrl.findByBookedCompanyId(11);
		pContrl.findByBookedRoomId(22);

	}
	
	void findByBookedCompanyId(int bookedCompanyId) {
		
		List<Presentation> presentation = pService.findByBookedCompanyId(bookedCompanyId);
		
		if(presentation==null) {
			System.out.println("Presentation not found");
		}
		
		else
		{
			System.out.println("Presentation: "+ presentation);
			
		}
		
	}
	
void findByBookedRoomId(int bookedRoomId) {
		
		List<Presentation> presentation = pService.findByBookedRoomId(bookedRoomId);
		
		if(presentation==null) {
			System.out.println("Presentation not found");
		}
		
		else
		{
			System.out.println("Presentation: "+ presentation);
			System.out.println(" ");
		}
		
	}
	

	void findByPresentationId(int presentationId) {
		
		Presentation presentation = pService.findByPresentationId(presentationId);
		
		if(presentation==null) {
			System.out.println("Service not found");
		}
		
		else
		{
			System.out.println("Presentation: "+ presentation);
		}
		
	}
	void addPresentation() {
		
		Presentation presentation = new Presentation();
		
		presentation.setPresentationId(15);
		presentation.setBookedCompanyId(12);
		presentation.setBookedRoomId(22);
		presentation.setStartTime("12:00am");
		presentation.setEndTime("09:00pm");
		
		pService.create(presentation);
	
	}

}
