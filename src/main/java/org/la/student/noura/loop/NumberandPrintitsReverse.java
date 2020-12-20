package org.la.student.noura.loop;

public class NumberandPrintitsReverse {

	public static void main(String[] args) {
		//Wap to enter a number and print its reverse
		
		int num=876;
		int revers=0;
		
		for(;num>0;) {
			
		int	reminder=num%10;
		num=num/10;
		revers=revers*10+reminder;
		
		}
		
		System.out.println(revers);
		
	}

}
