package org.la.student.tahir.jdbc.controller;

import java.util.List;

import org.la.student.tahir.jdbc.model.Attendee;
import org.la.student.tahir.jdbc.repository.AttendeeRepository;
import org.la.student.tahir.jdbc.service.AttendeeService;

public class AttendeeController {

	
	AttendeeService attendeeservice = null;
	
	AttendeeController(){
		
		attendeeservice = new AttendeeService();
	}
	
	
	
	public static void main(String[] args) {
		
		AttendeeController attCntrl = new AttendeeController();
		
		attCntrl.addAttendee();
		
	}
	

	void findAll(){
		
		List<Attendee> attlist = AttendeeRepository.findAll();
		
		System.out.println(attlist);
		
		
	}
	
	void findByAttendeeId(int attendeeId){
		
	Attendee attendee = AttendeeRepository.findByAttendeeId(attendeeId);
	 
	 System.out.println(attendee);
	}
	
	void findByFirstName(String firstname){
		List<Attendee> attlist = AttendeeRepository.findByFirstName(firstname);
		
		System.out.println(attlist);
	}
	
	void findByLastName(String lastname){
		
		List<Attendee> attlist = AttendeeRepository.findByLastName(lastname);
		
		System.out.println(attlist);
		
	}
	
	void findByPhone(String phone){
		Attendee attendee = AttendeeRepository.findByPhone(phone);
		
		System.out.println(attendee); 
	}
	
	void findByEmail(String email){
		
		Attendee attendee = AttendeeRepository.findByEmail(email);
		
		System.out.println(attendee);
	}
	
	void findVip(String vip){
		
		Attendee attendee = AttendeeRepository.findVip(vip);
		
		System.out.println(attendee);
		
	}
	
	void addAttendee() {
		
		Attendee attendee = new Attendee();
		
		attendee.setAttendeeId(1);
		attendee.setFirstName("Tahir");
		attendee.setLastName("Dalori");
		attendee.setPhone("08039588134");
		attendee.setEmail("tahirdalori1@gmail.com");
		attendee.setVip("seat");
		
		AttendeeService.create(attendee);
	}
}