package org.la.student.barry.method;

public class MethodOne {

	public static void main(String[] args) {
		System.out.println("main start");
		print();
		System.out.println("main end");
		print();
	}
	 static void print() {
		 System.out.println("Inside print method");
	 }
  static void display(int i) {
     }
  static int  getAge() {
	  return 9;
      }
 static char getGender(int age) {
	 return 'f';
 }
}

