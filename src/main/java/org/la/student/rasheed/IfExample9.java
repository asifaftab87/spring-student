package org.la.student.rasheed;

public class IfExample9 {

	public static void main(String[] args) {
		
		
		
		int percentage = 66;           
		
		
		System.out.println("program to check student grade");
		
		
		if (percentage>=60) {
			
			System.out.println("1st");
		}
		
		if  (percentage>=50 && percentage<=60) {
			
			System.out.println("2nd");
		}
		if(percentage>=40 && percentage<=49) {
			
			System.out.println("3rd");
		}
		if(percentage<=40) {
			
			System.out.println("fail");
		}
		System.out.println("end");
		

	}

}
