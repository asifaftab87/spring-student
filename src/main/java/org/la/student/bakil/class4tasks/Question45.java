package org.la.student.bakil.class4tasks;
/*
 * wap to find greatest number among three numbers
 * */
public class Question45 {

	public static void main(String[] args) {
		
		int x=3,y=12,z=7;
		
		if (x>y && x>z)
		{
			System.out.println(" The greatest number is : "+x);
		}      
		
		else if (y>x && y>z)
		{
			System.out.println("The greatest number is : "+y);
		}
		else {
			System.out.println("The greatest number is : "+z);
		}
}
	
}