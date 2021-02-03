package org.la.student.sajid.method;

public class ElegiblePersonToVote {
	public static void main(String[] args) {
		person(18);
		
	}
	
	static void person(int a) {
		if(a<18) {
			System.out.println("Yor are not allow for votes: "+a);
		}
		else if(a>=18) {
			System.out.println("You are allow for votes: "+a);
		}
	}

}
