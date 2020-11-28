package org.la.student.tania;

public class Control_statement_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A school has following rules for grading system:
		//a)below 25-F b)25 to 45-E c)45 to 50-D d)50 to 60 - C
		//e)60 to 80 - B f) above 80 - A
		
       int x= 90;
       if(x>80) {
    	   System.out.println("A");
       }
       else if(x>=80 || x>60) {
    	   System.out.println("B");
       }
       else if(x>=60 || x>50) {
    	   System.out.println("c");
       }
       else if(x>=50 || x>45) {
    	   System.out.println("d");
       }
       else if(x>=45 || x>25) {
    	   System.out.println("E");
       }
       else {
    	   System.out.println("F");
       }
       
	}

}
