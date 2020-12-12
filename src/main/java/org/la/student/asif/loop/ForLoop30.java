package org.la.student.asif.loop;

public class ForLoop30 {

	public static void main(String[] args) {
		//wap to print all lower case alphabets except vowels
		
		
		for (char ch ='a';ch<='z';ch++)
		{
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
			{
				System.out.println("ch : " +ch);
			}
			
		}


	}

}
