package org.la.student.sajid.method;

public class EvenMethod {
	public static void main(String[] args) {
		even(8);
	}
	
	static void even(int a){
		if(a%2==0) {
			System.out.println("this number is even: "+a);
		}else
			System.out.println("this number is not even: "+a);
	}

}
