package org.la.student.noor;
//wap to find smallest number among 3 numbers
public class IfElse8 {

	public static void main(String[] args) {
        int num1=10,num2=3,num3=14;
		
		if(num1<=num2 && num1<=num3) 
		{
			System.out.println("num1 is smallest");
		}
		else if(num2<=num1 && num2<=num3) 
		{
			System.out.println("num2 is smallest");
		}
		else
		{
			System.out.println("num3 is smallest");
		}

	}

}
