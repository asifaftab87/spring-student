package org.la.student.bakil.Class_8_Methods;
/*
 * double average(int, int, int) - find average of formal arguments and return result
 */
public class DoubleAverage_Method {


	public static void main(String[] args) {
	
		double result=average(12,5,3);
		System.out.println(result);
		
	}

	
	 static double average(int a, int b, int c)  {
	
		 double avg=(a+b+c)/3;
		 return avg;
	}
	
	}

