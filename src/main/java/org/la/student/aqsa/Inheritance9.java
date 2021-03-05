package org.la.student.aqsa;
class ABC
{
    void methodABC()
    {
        new XYZ().methodXYZ();
    }
}
 
class XYZ extends ABC
{
    void methodXYZ()
    {
        methodABC();
    }
}
 
public class Inheritance9
{
    public static void main(String[] args)
    {
        new ABC().methodABC();
    }   
}
