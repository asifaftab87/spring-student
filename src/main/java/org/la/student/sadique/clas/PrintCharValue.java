package org.la.student.sadique.clas;
/**  wap to print all these on basis of give character value
'A' -> Capital
'a' -> small
 */
public class PrintCharValue {
	public static void main(String[] args) {	
		int x; 
		for( x=0;x<26;x++) {
			System.out.println("Ascii value of = " + (char) ('A'+x)+ " : " + ('A'+x));
			System.out.println(" ");
		}for( x=0;x<26;x++) {
			System.out.println("Ascii value of = " + (char) ('a'+x) + " : " + ( 'a'+x));
			System.out.println(" ");
		}
	}
}
