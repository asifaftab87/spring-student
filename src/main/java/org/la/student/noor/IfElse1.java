package org.la.student.noor;
//wap to find which number is greater among three numbers
public class IfElse1 {

	public static void main(String[] args) {
		int num1=10,num2=30,num3=17;
		
		if(num1>=num2 && num1>=num3) 
		{
			System.out.println("num1 is greater");
		}
		else if(num2>=num1 && num2>=num3) 
		{
			System.out.println("num2 is greater");
		}
		else
		{
			System.out.println("num3 is greater");
		}
	}

}
