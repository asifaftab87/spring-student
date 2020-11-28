package org.la.student.asif.loop;

//wap to print first 5 even numbers
public class LoopWhile6 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		//System.out.println("end i: "+i);
	}
}
