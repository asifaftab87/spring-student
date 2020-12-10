package org.la.student.tahir.loop_programs;

public class Loop_45 {

	public static void main(String[] args) {
		//wap to print all numbers from 1 to 10 except 2 and 5 and 8.
		
		int a = 1;
		while(a<=10) {
			if(!(a==2 || a==5 || a==8))
				System.out.println(a);
			a++;
		}
	}

}
