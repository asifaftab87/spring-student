package org.la.student.aqsa;

class A8
{
    static void methodOne()
    {
        System.out.println("AAA");
    }
}
 
class B8 extends A8
{
//	@Override- The method methodOne() of type B8 must override or implement a supertype method
    
	static void methodOne()
    {
        System.out.println("BBB");
    }
}
 
public class Inheritance8
{
    public static void main(String[] args)
    {
        A8 a = new B8();    // object type is B but ref is A so output will be AAA(compile time)
        a.methodOne();
        
        B8 b = new B8();    // reference is b output is BBB
        b.methodOne();
        
        A8.methodOne();
        
        B8.methodOne();
        
    }   
}
