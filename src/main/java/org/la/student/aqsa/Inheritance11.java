package org.la.student.aqsa;
class ABC11
{   
    String myMethod(String s)
    {
        return s+s;
    }
}
 
class PQR11 extends ABC11
{
    String myMethod(String s, double d)
    {
        return myMethod(s+d);
    }
}
 
class XYZ11 extends PQR11
{
    String myMethod(String s, double d, int i)
    {
        return myMethod(s, d+i);
    }
}
 
public class Inheritance11
{
    public static void main(String[] args)
    {
        XYZ11 xyz = new XYZ11();
         
        System.out.println(xyz.myMethod("JAVA", 23.23, 111));
    }   
}
