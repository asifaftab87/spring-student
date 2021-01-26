package org.la.student.nawaz;

public class MethodOverloading2 {


    public static void main(String[] args) {
	
	Example("ABC");
	Example(1);
	
	}
    public static void Example(String b) 
    
    {
	System.out.println("This is the different example of String Method Overloading");
    }

     public static void Example(int a) 
     
     {
	System.out.println("This is the Second different example of Integer Method Overloading");
     }

}