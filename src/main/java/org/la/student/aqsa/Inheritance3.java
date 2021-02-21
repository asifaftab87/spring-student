package org.la.student.aqsa;
class A3{
	String s="class A";
}

class B3 extends A3{
	String s ="class B";
{
	System.out.println(super.s); 
}
}
class C3 extends B3{
	String s = "class C";
	{
		System.out.println(super.s); 
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		C3 c = new C3();                        
		System.out.println(c.s);   
	}

}
