package org.la.student.jamal.loob;

public class ForLoob50 {
	
	//50.	Wap to print all odd number between 1 to 100.
	
	public static void main(String[] args) {
		

		int i=1;
		for(;i<=100;i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
			
		}
		int j=1;
		while (j<=100) {
			if(j%2!=0) {
				System.out.println("this is while :"+ j);
			}
			j++;
		}
	}

}
