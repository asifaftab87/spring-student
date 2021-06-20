package org.la.student.jamal.clas;

public class UsersMaun {

	public static void main(String[] args) {
		
		Users users=new Users();
		
		users.set("Jamal Alkatheeri", "Jamal@hotmailcom", "M", "24-12-1988", "+51");
		
		users.display();
		
		System.out.println("_______________________________________________________________");
		
		
		String n=users.getFullName();
		String e=users.getEmail();
		String g=users.getGender();
		String db=users.getDateOfBirth();
		String c=users.getCountryCode();
		
		System.out.println(" fullName: "+n+"\n email: "+e+"\n gender: "+g+"\n dateOfBirth: "+db+"\n countryCode: "+c);
		

	}
	

}
