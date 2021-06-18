package org.la.student.bakil.Class_8_Methods;
/*
 * char[] reverse(char[] src)
		create new array and copy the src array to new array in reverse order 
	char[] reverse(char[] src)
		reverse the same array and return.
 */
public class ReverseChar_Method {

	public static void main(String[] args) {
		
		char[] letters = {'L', 'I', 'K', 'A', 'B'};
		reverse (letters);
}
	
	static char [] reverse(char [] letters) {
		
		int i = letters.length - 1, j = 0;
		char[] scr = new char[letters.length];
		for(;  i >= 0;i--,j++){
		     scr[j] = letters[i];
		}
		for (char c : scr){
		     System.out.print(c);
		}
		return scr;
	}
}
