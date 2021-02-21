package org.la.student.aqsa;

class Mai {
	int i =10;
	String s ="Parent Class Variable";
}
class Init extends Mai{
	
	int i = 20;
	String s = "Child Class Variable";
}
class Inheritance2 {
public static void main(String[] args) {
		
	Mai a = new Init();                 //whether the variable is static or non static
		                                //  it will always takes place by Compiler (Reference type) and not Runtime (Object type)
		                                // Here Ref is of Parent type so that 
		                                //value of instance variable i
		                                // will always be of parent type 
System.out.println(a.i + " is "+a.s );  // i=10  (Reference is of parent type)
		
	Init a1 = new Init();                // "Init" is child class and "a1" is Reference of child class
System.out.println(a1.i + " is "+a1.s ); // i=20 (Reference a1 is of child type
		                                 //so it will print child class variable)

}
}
