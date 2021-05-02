package org.la.student.bakil.class2tasks;
/*
 *      int a = 31, b = 40;
        int c = b - a;
        b = c % a;        
        b = b / a;        
        a = ++c;        
        b = (a - --b) * c;
 */
public class Question_28 {

	public static void main(String[] args) {
		
		int a = 31, b = 40;
        int c = b - a;//9
        b = c % a; //  0     
        b = b / a; //0       
        a = ++c;      //10  
        b = (a - --b) * c;
        System.out.println("B = "+b);
		

	}

}
