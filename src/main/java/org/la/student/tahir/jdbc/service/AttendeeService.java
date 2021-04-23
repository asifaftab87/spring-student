package org.la.student.tahir.jdbc.service;

import java.util.List;

import org.la.student.tahir.jdbc.model.Attendee;
import org.la.student.tahir.jdbc.repository.AttendeeRepository;

public class AttendeeService {

	
	public AttendeeService() {
		
		AttendeeRepository.connectionOpen();
	}
	
	public static List<Attendee> findAll(){
		List<Attendee> attlist = AttendeeRepository.findAll();
		return attlist;
		
	}
	
	public static Attendee findByAttendeeId(int attendeeId){
		
		return AttendeeRepository.findByAttendeeId(attendeeId);
	}
	
	public static List<Attendee> findByFirstName(String firstname){
		List<Attendee> attlist = AttendeeRepository.findByFirstName(firstname);
		
		return attlist;
	}
	
	public static List<Attendee> findByLastName(String lastname){
		
		List<Attendee> attlist = AttendeeRepository.findByLastName(lastname);
		
		return attlist;
		
	}
	
	public static Attendee findByPhone(String phone){
		
		return AttendeeRepository.findByPhone(phone);
	}
	
	public static Attendee findByEmail(String email){
		
		return AttendeeRepository.findByEmail(email);
	}
	
	public static Attendee findVip(String vip){
		
		return AttendeeRepository.findVip(vip);
	}
	
	public static void create(Attendee attendee) {
		
		AttendeeRepository.create(attendee);
	}
	

public static void update() {
	AttendeeRepository.update();
	
	Attendee attendee = new Attendee();
	
	attendee.getAttendeeId();
	attendee.getFirstName();
	attendee.getLastName();
	attendee.getPhone();
	attendee.getEmail();
	attendee.getVip();
	
	
}
}
