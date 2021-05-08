package org.la.student.jamal.loob;

public class ForLoob57 {
	
	//55.	Wap to count number of digits in a number.
	
	public static void main(String[] args) {
		

		int k=0;
		for (int i=678540;i!=0;k++) {
			i/=10;
		}
		System.out.println(k);
		
		
		int j=0;
		int b=678540;
		while (b!=0) {
			b/=10;
			
			j++;
		}
		System.out.println("this is while :" +j);
		
	}

}
