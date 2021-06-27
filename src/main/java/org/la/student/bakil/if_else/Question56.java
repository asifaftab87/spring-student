package org.la.student.bakil.if_else;
/*
 *  wap to print alphabet if the given character is 'alphabet' else print 'non alphabet'
 * */
public class Question56 {

	public static void main(String[] args) {
		
	char x='u';
		
		if ((x >='A' && x <= 'Z') || (x>='a' && x<='z'))
		{
			System.out.println("The character entered is alphabet ");
		}      
	
		else 
		{
			System.out.println("The character entered is not alphabet");
		}

}
	
}