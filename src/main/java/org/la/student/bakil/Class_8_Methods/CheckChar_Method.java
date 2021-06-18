package org.la.student.bakil.Class_8_Methods;
/*
 * int checkChar(char c) 
		return 1 if argument is capital letter or -1 if lower case, 0 if not alphabet
 */
public class CheckChar_Method {

	public static void main(String[] args) {
		
		 char y = 's';
		 int i=checkchar(y);
		 System.out.println(+i);
		 

	}
	
		static int checkchar(char x)
		{
			if (x>='a' && x<='z') 
			
			return -1;
				
			if (x >='A' && x<='Z')
				
			return 1;
			
			else
				return 0;
			
		}

		

		}
