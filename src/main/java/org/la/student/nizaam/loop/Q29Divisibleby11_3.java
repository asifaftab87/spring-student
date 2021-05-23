package org.la.student.nizaam.loop;

public class Q29Divisibleby11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	29.	wap to print all numbers between 100 to 1 those are divisible by 11 and 3.
		
		for(int i=100; i>=1;i--) {
			if(i%3==0 && i%11==0) {
				System.out.println(i);
			}
		}


	}

}
