package org.la.student.nizaam.loop;

public class Q8Divisibleby3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	8.	wap to print numbers which is completely divisible by 3 and 2 between 1 to 10.
		
		for(int i=1; i<=10;i++) {
			if(i%2==0 && i%3==0)
				System.out.println(i);
		}
	}

}
