package org.la.student.bakil.class4tasks;
/*
 * wap to find which number is greater among three numbers
 */
public class Question2 {

	public static void main(String[] args) {
		
		int x=13,y=41,s=18;
		if (x>y && x>s) {
			System.out.println("The greates number is : "+x);
		}
		else if(y>x && y>s)
		{
			System.out.println("The greatest number is "+y);
		}
		else {
			System.out.println("The greatest number is :"+s);
		}

	}

}
