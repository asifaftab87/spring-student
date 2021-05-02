package org.la.student.asif.cond;

public class IfExample4 {

	public static void main(String[] args) {

		int per = 51;
		
		System.out.println("Program to check student grade");
		
		if(per>=60) {
			System.out.println("1st");
		}
		
		if(per>=50 && per<60) {
			System.out.println("2nd");
		}
		
		if(per>=40 && per<=49) {
			System.out.println("3rd");
		}
		
		if(per<40) {
			System.out.println("fail");
		}
		
		System.out.println("end");
	}

}
