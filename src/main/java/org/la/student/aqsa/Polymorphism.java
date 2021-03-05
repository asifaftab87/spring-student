package org.la.student.aqsa;
public class Polymorphism
{
    public static void main(String[] args)
    {
    	Apoly a = new Apoly();
         
        a = new  Bpoly();
         
        a = new Cpoly();
        System.out.print("Yes  "+a+" , is Polymorphism");
    }
}
class Apoly
{
     
}
 
class Bpoly extends Apoly
{
     
}
 
class Cpoly extends Bpoly
{
     
}
 