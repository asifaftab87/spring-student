package org.la.student.nizaam.week4tasks;

public class Q2GreatestofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	2.	wap to find which number is greater among three numbers
		/*int a=45,b=50,c=70;
		int greatest = (a>b)? ((a>c)?a:c):b;
		System.out.println("Greatest of given numbers is "+greatest);
		*/
		
		  int a, b, c, temp, result;
	      a = 10;
	      b = 20;
	      c = 30;

	      temp = a < b ? a:b;
	      result = c < temp ? c:temp;
	      System.out.println("Largest number is ::"+result);
	}

}
