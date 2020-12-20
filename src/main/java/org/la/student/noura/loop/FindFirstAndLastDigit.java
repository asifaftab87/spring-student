package org.la.student.noura.loop;

public class FindFirstAndLastDigit {

	public static void main(String[] args) {
		//Wap to find first and last digit of a number
		
		//using while
		
		int num =7615239;
		
		int firstDigit =0 , lastDigit=0;
		
		lastDigit = num%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(num!=0) {
        	int s=0;
        	int r=num%10;
        	s=s*10+r;
            num /= 10;
            firstDigit=s%10;
        }
        System.out.println("First digit: "+firstDigit);
	}
	
	
	
	
}
