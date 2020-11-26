package org.la.student.ameen;

public class CapitalSmall {

	public static void main(String[] args) {
		// wap to print 'capital' if given character is capital letter, else print 'small' if charater is in lower case
		char ch = '1';
				if(ch >= 'A' && ch <= 'Z')
				{
					System.out.println("capital");
				}
				else if(ch >= 'a' && ch <= 'z')
				{
					System.out.println("small");
				}
				else 
				{
					System.out.println(" given character is not capital nor small");
				}
	}

}
