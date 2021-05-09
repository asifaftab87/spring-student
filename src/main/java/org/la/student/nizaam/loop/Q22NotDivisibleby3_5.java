package org.la.student.nizaam.loop;

public class Q22NotDivisibleby3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	22.	wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		
		for(int i =10; i<=70; i++) {
			if(i%3!=0 && i%5!=0) {
				System.out.println(i);
			}
		}
	}

}
