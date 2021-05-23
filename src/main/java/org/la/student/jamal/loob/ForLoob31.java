package org.la.student.jamal.loob;

public class ForLoob31 {
	//31.	wap to give a condition that loop may be rotate upto 10 but break loop when it rotates uptop 7 times.

	public static void main(String[] args) {
		
		for (int i=0; i<10;i++) {
			if (i==7) {
				break;
			}
			System.out.println(i);
		}
		
		int j =0;
		while (j<10) {
			if (j==7) {
				break;
			}
			System.out.println("this is while " + j);
			j++;
		}
		
		



		

	}

}
