package org.la.student.jamal.method;

public class ArithmeticOperation {
	/*reate a class name ArithmeticOperation
		create these methods
			int add(int, int)
			int sub(int, int)
			int mul(int, int)
			int reminder(int, int)
			double div(int, int)
			double average(int, int, int)
			double percent(int, int, int, int, int)
			long factorial(int)
			boolean prime(int)
			void fibonocci(int)
	 * 
	 */

	public static void main(String[] args) {
		

		int add = add(3,10);
		System.out.println("this is add : "+ add);
		
		int sub = sub(20,5);
		System.out.println("this is sub : "+sub);
		
		int mul = mul(3,10);
		System.out.println("this is mul : "+ mul);
		
		int reminder=reminder(10,4);
		System.out.println("this is reminder : "+ reminder);
		
		double div =div(16,3);
		System.out.println("this is div : "+ div);
		
		double average = average(10,4,3);
		System.out.println("this is the average : "+ average);
		
		double percent=percent(90,95,85,99,100);
		System.out.println("this is the percent : "+percent);
		
		
		
		
		
	}
	static int add(int a, int b) {
		
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
		
	}

	static int mul(int a, int b) {
		return a*b;
		
	}
	
	static int reminder(int a, int b) {
		return a%b;
		
	}
	static double div(int a, int b) {
		return a/b;
	}
	
	static double average(int a, int b, int c) {
		return (a+b+c)/3.0; 
	}
	
	static double percent(int a, int b, int c, int d, int f) {
		int all =a+b+c+d+f;
		return (all *100)/500;
	}

}
