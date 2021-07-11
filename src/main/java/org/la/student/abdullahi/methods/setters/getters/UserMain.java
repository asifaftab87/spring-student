package org.la.student.abdullahi.methods.setters.getters;

public class UserMain {

	public static void main(String[]args) {
		
		User u = new User();
		u.setId(01);
		u.setFullName("Sultan");
		u.setGender("Male");
		u.setEmail("sulatn@gmail.com");
		u.setDateOfBirth("28th,June 1980");
		u.setCountryCode("+90");
		u.setCreatedAt("Los Angelos");
		
		int Id =  u.getId();
		String FullName = u.getFullName();
		String Gender = u.getGender();
		String Email = u.getEmail();
		String DateOfBirth = u.getDateOfBirth();
		String CountryCode = u.getCountryCode();
		String CreatedAt = u.getCreatedAt();
		
		System.out.println("ID = " +Id);
		System.out.println("Full Name = " +FullName);
		System.out.println("Gender = " +Gender);
		System.out.println("Email = " +Email);
		System.out.println("Date Of Birth = " +DateOfBirth);
		System.out.println("Country Code = " +CountryCode);
		System.out.println("Created At" +CreatedAt);
		
		
		
		
	}
    
    
}