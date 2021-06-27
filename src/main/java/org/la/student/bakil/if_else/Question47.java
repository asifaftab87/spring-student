package org.la.student.bakil.if_else;
/*
 * wap to find least number among three numbers
 * */
public class Question47 {

	public static void main(String[] args) {
		
		int x=1,y=0,z=2;
		
		if (x < y && x < z)
		{
			System.out.println(" The least number is : "+x);
		}      
		
		else if (y < x && y < z)
		{
			System.out.println("The least number is : "+y);
		}
		else
		{
			System.out.println("The least number is : "+z);
		}
}
	
}