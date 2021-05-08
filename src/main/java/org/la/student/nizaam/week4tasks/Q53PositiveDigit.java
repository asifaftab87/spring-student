package org.la.student.nizaam.week4tasks;

public class Q53PositiveDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	53. wap to check whether a given number is positive and double digit or single digit number 
		int num=20;
		if(num>0) {
			if(num>9 && num <100)
				System.out.println("Given number is positive and is Double digit");
			else if(num<9)
				System.out.println("Given number is positive and single digit");
		}
		else
			System.out.println("Given number is not positive");
		
	}

}
