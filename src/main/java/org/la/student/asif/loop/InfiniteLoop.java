package org.la.student.asif.loop;

public class InfiniteLoop {

	//wap to print table of any number
	
	public static void main(String[] args) {
		
		int n = 2;
		int i = 1;
		
		while(true) {
			
			System.out.println(n+" * " + i + " = "+(n*i));
			if(i==10) {
				break;
			}
			i++;
		
		}
	}
}
