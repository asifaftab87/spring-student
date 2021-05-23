package org.la.student.nizaam.loop;

public class Q38NumExcept2_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	38.	wap to print all numbers from 1 to 10 except 2 and 5 and 8.
		for(int i=1; i<=10; i++) {
			if(i==2 || i==5 || i==8)
				continue;
			System.out.println(i);
		}
	}

}
