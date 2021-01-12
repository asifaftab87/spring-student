package org.la.student.tahir.method;

public class Voteeligibility {
	// Vote eligibility
	public static void main(String[] args) {
		
		int age =18;
		
		vote(age);
	
	
		
	}
	
	
	static void vote(int a) {
		if (a>=18)
			System.out.println("Eligible to vote");
		else
			System.out.println("Not eligible to vote");
		
		
	}
	
	

}
