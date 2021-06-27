package org.la.student.bakil.if_else;
/*
 * wap to print 'num' if any given character is char numeric e.g. '1' or any such given number
 * */
public class Question51 {

	public static void main(String[] args) {
		
	char x=55;		
	if ((x >=97 && x <=122 )||(x>=65 && x<=90))
		{
			System.out.println(" The character entered is numeric "+x);
		}      
		
	
		else {
			System.out.println("The character entered is not numeric ");
		}
}
	
}