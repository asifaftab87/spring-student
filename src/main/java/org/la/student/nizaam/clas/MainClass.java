package org.la.student.nizaam.clas;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company c = new Company();
		c.setCompanyId(345);
		c.setDescription("This is a career guidance Company");
		c.setName("CareerNet");
		
		System.out.println("Company Name "+c.getName());
		System.out.println("Comapny Id "+c.getCompanyId());
		System.out.println("Company Description "+c.getDescription());
		
		System.out.println("------------------------");
		
		Presentation p = new Presentation();
		p.setBookedCompanyId(12345);
		p.setPresentaitonId(678);
		p.setBookedRoomId(4);
		p.setStartTime("10 AM");
		p.setEndTime("12 PM");
		
		System.out.println("Presentation ID "+ p.getPresentaitonId());
		System.out.println("BookedCompanyID "+ p.getBookedCompanyId());
		System.out.println("BookedRoom ID "+ p.getBookedRoomId());
		System.out.println("Start Time "+ p.getStartTime());
		System.out.println("End Time "+ p.getEndTime());
		
		System.out.println("------------------------");
		
		Room r = new Room();
		r.setRoomId(345678);
		r.setFloorNum(3);
		r.setSeatCapacity(25);
		
		System.out.println("RoomID "+ r.getRoomId());
		System.out.println("FloorNum "+r.getFloorNum());
		System.out.println("Seat Capacity "+r.getSeatCapacity());
		
		System.out.println("------------------------");
		
		Attendee a = new Attendee();
		a.setAttendeeId(212);
		a.setFirstName("Nizaam");
		a.setLastName("SM");
		a.setEmail("nizaam.sm@gmail.com");
		a.setPhone(9876543210L);
		a.setVip(true);
		
		System.out.println("Attendee Id "+ a.getAttendeeId());
		System.out.println("First Name "+a.getFirstName());
		System.out.println("Last Name "+a.getLastName());
		System.out.println("Email "+a.getEmail());
		System.out.println("Phone "+a.getPhone());
		System.out.println("VIP "+a.isVip());
		
		System.out.println("------------------------");
		
		PresentationAttendee pa  = new PresentationAttendee();
		pa.setAttendeeId("PA567828");
		pa.setPresentationId(345679);
		pa.setTicketId(789);
		
		System.out.println("AttendeeId "+pa.getAttendeeId());
		System.out.println("Presentation ID "+pa.getPresentationId());
		System.out.println("TicketId "+pa.getTicketId());
		
		System.out.println("------------------------");
		
		Employee e = new Employee();
		e.setId(530);
		e.setEmployeeNum(9876543);
		e.setEmployeeName("Nizaam");
		e.setDatehired("5/12/2010");
		e.setCityId(560036);
		
		System.out.println("id  "+e.getId());
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee Num "+e.getEmployeeNum());
		System.out.println("Date Hired "+e.getDatehired());
		System.out.println("CityId "+e.getCityId());
		
		System.out.println("------------------------");
		
		SalariedEmployee se = new SalariedEmployee();
		se.setId(567890);
		se.setEmployeeId("Emp34567");
		se.setAnnualSalary(2891890.987);
		
		System.out.println("Employee id :"+se.getEmployeeId());
		System.out.println("Id :"+se.getId());
		System.out.println("Annual Salary : "+ se.getAnnualSalary());
		
		System.out.println("------------------------");
		
		City city = new City();
		city.setId(25);
		city.setCity("Bangalore");
		
		System.out.println("City Id "+city.getId());
		System.out.println("City "+city.getCity());
		
		System.out.println("------------------------");
		
		HourlyEmployee he = new HourlyEmployee();
		he.setId(15);
		he.setEmployeeId(234);
		he.setAnnualSalary(123456.98);
		
		System.out.println("Id : "+ he.getId());
		System.out.println("Employee Id : "+ he.getEmployeeId());
		System.out.println("Annual Salary : "+ he.getAnnualSalary());
		
		System.out.println("------------------------");
		
		OrderItems Oi = new OrderItems();
		Oi.setOrderId(7869);
		Oi.setProductId(9988765);
		Oi.setQuantity(4);
		
		System.out.println("Order Id :"+ Oi.getOrderId());
		System.out.println("Product id : "+ Oi.getProductId());
		System.out.println("Quantity : "+Oi.getQuantity());
		
		System.out.println("------------------------");
		
		Orders os = new Orders();
		os.setId(4567);
		os.setUserid("nizaamsm");
		os.setStatus("Ready to Ship");
		os.setCreatedAt("June 20 2021");
		
		System.out.println("Order ID : "+os.getId());
		System.out.println("UserId : "+ os.getUserid());
		System.out.println("Status : "+os.getStatus());
		System.out.println("Created at : "+ os.getCreatedAt());
		
		System.out.println("------------------------");
		
		Users usr = new Users();
		usr.setId(9874);
		usr.setFullName("Nizaamuddeen");
		usr.setEmail("nizaamsm@gmail.com");
		usr.setGender("male");
		usr.setCountryCode("IN");
		usr.setDateofBirth(new Date(01/05/1986));
		usr.setCreatedAt(new Date());
				
		System.out.println("User ID "+usr.getId());
		System.out.println("FullName : "+usr.getFullName());
		System.out.println("Email : "+usr.getEmail());
		System.out.println("Gender : "+usr.getGender());
		System.out.println("Country code : "+usr.getCountryCode());
		System.out.println("Date of birth : "+usr.getDateofBirth());
		System.out.println("created at "+ usr.getCreatedAt());
		
		System.out.println("------------------------");
		
		
	}

}
