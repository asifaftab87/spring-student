package org.la.student.barry;

public class Question9arithmetic17 {
	/*
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
	 * */
	public static void main(String[] args) {
		int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
        System.out.println("b:"+ b);
	}

}
