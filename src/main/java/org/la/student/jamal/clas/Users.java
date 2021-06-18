package org.la.student.jamal.clas;

/*12.	Create a class Users having member variables id, fullName,
 *  email, gender, dateOfBirth, countryCode, createdAt. create getters and setters
 *   for all member variables. Create object of Users class in other class inside main
 *    method and set all member values and print all member values using getters.
 * 
 */

public class Users {
	
	private String fullName;
	private String email;
	private String gender;
	private String dateOfBirth;
	private String countryCode;
	
	public String getFullName() {
		return fullName;
		
	}
	public String getEmail() {
		return email;
		
	}
	public String getGender() {
		return gender;
		
	}
	public String getDateOfBirth() {
		return dateOfBirth;
		
	}
	public String getCountryCode() {
		return countryCode;
		
	}
	
	public void set(String n,String e,String g ,String db,String c) {
		fullName=n;
		email=e;
		gender=g;
		dateOfBirth=db;
		countryCode=c;
		
		
	}
	public void display() {
		System.out.println(" fullName: "+fullName+"\n email: "+email+"\n gender: "+gender+"\n dateOfBirth: "+dateOfBirth+"\n countryCode: "+countryCode);
	}
	
	
	
	

	
	
	
	
	
	

}
