package org.la.student.nizaam.loop;

public class Q37NumExcept3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	37.	wap to print all numbers from 1 to 10 except 3 and 7.
		for(int i=1; i<=10; i++) {
			if(i==3 || i==7)
				continue;
			System.out.println(i);
		}
	}

}
