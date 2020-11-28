package org.la.student.asif.loop;

//wap to print first 5 even numbers
public class LoopWhile7 {

	public static void main(String[] args) {
		
		int i = 1;
		
		while(i<=10) {
			
			if(i==4) {
				break;
			}
			System.out.println("i: "+i);
			
			i++;
		}
		
		//System.out.println("end i: "+i);
	}
}
