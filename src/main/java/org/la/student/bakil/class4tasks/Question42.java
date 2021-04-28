package org.la.student.bakil.class4tasks;
/*
 * wap to print ternary if number is 3 digit
 * */
public class Question42 {

	public static void main(String[] args) {
		
		int x=111;
		
		if ((x >99 && x <999) || (x <-99 && x > -999)) {
			System.out.println(" The number entered is 3 digit ");
		}      
		
		else {
			System.out.println("The number entered is not 3 digit");
		}
}
}