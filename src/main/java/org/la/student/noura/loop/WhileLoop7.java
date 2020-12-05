package org.la.student.noura.loop;

public class WhileLoop7 {

	public static void main(String[] args) {
		
		// wap to print all lower case alphabets except vowels
		
	char alpha= 'a';
	while(alpha<='z')
	{
		if(!(alpha=='a' || alpha=='e'  || alpha=='i' || alpha=='o'  || alpha=='u')) {
			
			System.out.println(alpha);
		}
		alpha++;
		
	}

	
	
	}

}
