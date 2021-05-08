package org.la.student.jamal.loob;

public class ForLoob38 {
	
	//38.	wap to print all numbers from 1 to 10 except 2 and 5 and 8.
	
	public static void main(String[] args) {
		

		for (int i=1; i<=10; i++) {
			if (( i!=2)&&(i!=5)&&(i!=8)) {
				System.out.println(i);
			}
		}
		
		int j=1;
		while (j<=10) {
			if ((j!=2)&&(j!=5)&&(j!=8)) {
				System.out.println("this is while :" +j);
				
			}
				j++;
		}
		

	}

}
