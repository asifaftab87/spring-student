package org.la.student.rasheed.method;

public class MethodOne {

	public static void main(String[] args) {
		print();
		System.out.println("main start");
		
		print();
		print();
		
		System.out.println("main end");
		print();

	}//Classification of Method into 4 type based on the return type and Arugment
	//(1.)Neither Return or Nor Accept; suppose you have any Argument in the Static Void print ()
	//the method will Accept the value
	static void print() {
		System.out.println("inside print method");
	}
	//(2.) Not Returning But Accepting
	static void display (int i) {// Here it is not returning anything, but rather it accepting the value of integer,
		//which you have to return the same data type of INT '9'
		//it might be accepting 1 integer, double, float, because there is no specification

}
	static int getAge () {//(3.)Returning But Not Accepting
		return 9;//Here the Method is not accepting Any Value, but returning the value
	}
	static char geGender(int age) {//(4.0)accepting and Returning 
		return 'f';//Here, what data type you mentioned,(CHAR) you have to return the same data type of CHAR 'F'
	}
}
