package org.la.student.bakil.class4tasks;
/*
 * wap to print single if number is single digit
 * */
public class Question41 {

	public static void main(String[] args) {
		
		int x=-1;
		
		if ((x > 0 && x <9) || (x < 0 && x > -9)) {
			System.out.println(" The number entered is single digit ");
		}      
		
		else {
			System.out.println("The number entered is double digit");
		}
}
}