package org.la.student.aqsa;
class ABCD
{   
    void methodABCD()
    {
        System.out.println(111);
    }
     
    void methodABCD(int i)
    {
        System.out.println(222);
    }
}
class WXYZ extends ABCD
{
    @Override
    void methodABCD(int i)
    {
        System.out.println(333);
    }
     
    @Override
    void methodABCD()
    {
        System.out.println(444);
    }
}
 
public class Inheritence10
{
    public static void main(String[] args)
    {
        ABCD abc = new WXYZ();
         
       abc.methodABCD(10);  // 333 because overriding takes place at runtime and here we are making object of WXYZ hence method will be called by WXYZ
         
       abc.methodABCD();     // 444 overriding hence runtime (object WXYZ)
    }   
}
