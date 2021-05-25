package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.Presentation;
import org.la.student.tahir.jdbc.repository.PresentationRepository;

public class PresentationService {

	public PresentationService() {
		
		PresentationRepository.connectionOpen();
	}
	
	public Presentation findByPresentationId(int presentationId) {
		
		System.out.println("********Find by PresentationId**********");
		
		return PresentationRepository.findByPresentationId(presentationId);
	}
	
public List<Presentation> findByBookedRoomId(int bookedRoomId) {
	
	System.out.println("******Find by BookedRoomId********");
	
		return PresentationRepository.findByBookedRoomId(bookedRoomId);
	}

public List<Presentation> findByBookedCompanyId(int bookedCompanyId) {
	
	System.out.println("******Find by BookedCompanyId*******");
	
	return PresentationRepository.findByBookedCompanyId(bookedCompanyId);
}

	public void create(Presentation presentation) {
		
		PresentationRepository.create(presentation);
	}
	
	public static  void update() {
		
		PresentationRepository.update();
		
		Presentation presentation = new Presentation();
		presentation.getPresentationId();
		presentation.getBookedCompanyId();
		presentation.getBookedRoomId();
		presentation.getStartTime();
		presentation.getEndTime();
		
	}
	
}
