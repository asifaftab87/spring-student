package org.la.student.noura.loop;

public class LoopSum {

	public static void main(String[] args) {
		//for reversing we use loop,%,/
		
		//To find out sum of any numbers
		
		int i=213; //6
		
		int s=0;
		for(;i>0;) {
			
			int r= i%10;
			i=i/10;
			s=s+r;
		}
		System.out.println(s);
	
		
		

	}

}
