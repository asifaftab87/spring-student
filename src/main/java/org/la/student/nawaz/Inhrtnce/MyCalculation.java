package org.la.student.nawaz.Inhrtnce;

public class MyCalculation extends Calculation{
	
	int z;
	
	public void Multiplication(int x, int y) {
		
		z=x*y;
		System.out.println("The Product of two numbers are:"+z);
	}
	public static void main(String args[]) {
		
	      int a = 20, b = 10;
	      
	      
	      MyCalculation demo = new MyCalculation();
	      
	     demo.Addition(a,b);
	     
	      demo.Subtraction(a,b);
	      
	      demo.Multiplication(a,b);
	   }
	}


