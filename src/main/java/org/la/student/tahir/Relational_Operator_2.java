package org.la.student.tahir;

public class Relational_Operator_2 {

	public static void main(String[] args) {

		{
			boolean lampX = false, result;
			boolean lampY = true;
			result = lampY && lampX;
			System.out.println("Lamp switch-on1 " + result);
			result = lampY & lampX;
			System.out.println("Lamp switch-on1 " + result);
		}
		

		{
			boolean lampX = false, result;
			boolean lampY = true;
			result = lampY || lampX;
			System.out.println("Lamp switch-on2 " + result);
			result = lampY | lampX;
			System.out.println("Lamp switch-on2 " + result);
		}
		

		{
			boolean lampX = false, result;
			boolean lampY = true;
			result = lampY || lampX;
			System.out.println("Lamp switch-on3 " + result);
			result = lampY && lampX;
			System.out.println("Lamp switch-on3 " + result);
		}
		

		{
			boolean lampX = false, result;
			boolean lampY = true;
			result = lampY && lampX;
			System.out.println("Lamp switch-on4 " + result);
			result = lampY || result;
			System.out.println("Lamp switch-on4 " + result);
		}
		

		{
			boolean lampX = false, result;
			boolean lampY = true;
			result = lampY || lampX;
			System.out.println("Lamp switch-on5 " + result);
			result = result && lampX;
			System.out.println("Lamp switch-on5 " + result);
		}
		
		{
			int c=0, e=50;
			boolean b= (c==1) && (++e < 100);
			System.out.println("e= "+ e);
			boolean f = (++e < 100) && (c ==1);
			System.out.println("e = " +e);
			System.out.println("b : " +b);
			System.out.println("f : " +f);
		}
		
		{
			int c=0, e=50;
			boolean b= (c==1) || (++e < 100);
			System.out.println("e= "+ e);
			boolean f = (e++ < 100) || (c ==1);
			System.out.println("e = " +e);
			System.out.println("b : "+ b);
			System.out.println("f : "+ f);
		}
		
		

	}

}
