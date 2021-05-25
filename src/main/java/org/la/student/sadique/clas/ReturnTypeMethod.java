package org.la.student.sadique.clas;

public class ReturnTypeMethod {
static int getTotal(int a,int b) {
	System.out.println("Sum of integer are " + (a+b));
	return (a+b);
}
public static void main(String[] args) {
	int x = getTotal(5,3);
	boolean r =even(5);
	System.out.println(r);
}
static boolean even(int i) {
	
	if( i%2==0) {
		System.out.println(i+ " is even Number");
	return true;
	}else {
		System.out.println(i+ " is not even Number");
	return false;
	}
}
}
