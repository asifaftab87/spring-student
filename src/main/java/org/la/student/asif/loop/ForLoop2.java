package org.la.student.asif.loop;

public class ForLoop2 {

	public static void main(String[] args) {
		
		int i=1;
		for(;;) {
			System.out.println(i);
			if(i==100)
				break;
			i++;
		}
		
		System.out.println("end of program");
	}
}
