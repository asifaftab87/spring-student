package org.la.student.jamal;

public class Question17 {

	/*
	 * 17.	int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
	

	 */
	public static void main(String[] args) {
		
		
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        
      


	}

}
