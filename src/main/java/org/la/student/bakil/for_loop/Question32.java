package org.la.student.bakil.for_loop;

/*
 *   wap to print all upper case alphabets except vowels.
 */
public class Question32 {

	public static void main(String[] args) {
	
		for (char x='A';x<='Z';x++) {
			if (x!='A' && x!='E' && x!='I' && x!='O')
			System.out.println(x);
			}
			
	}

}
