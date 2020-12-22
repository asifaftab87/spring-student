package org.la.student.tahir.loop_programs;

public class For_Loop_54 {

	public static void main(String[] args) {
		//Wap to check whether a number is palindrome or not.
		
		int a = 30303, original;
		original = a;
		
		int r= 0;
		
		for(; a!=0; ) {
			
			r = r*10;
			r= r + a%10;
			a = a/10;
			
			
		}
		
		if(original == r) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}

