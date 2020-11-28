package org.la.student.ameen;

public class LeastNum {

	public static void main(String[] args) {
		//wap to find least number among three numbers
		int a = 34 , b = 54 , c = 76;
		if(a < b && a < c)
		{
			System.out.println(" a is the least number");
		}
		else if(b < a && b < c)
		{
			System.out.println("b is the least number");
		}
		else 
		{
			System.out.println(" c is the least number");
		}
	}

}
