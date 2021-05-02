package org.la.student.bakil.student.tasks;
/*
 * wap to find which number is greater among two numbers
 */
public class If_Else_1_2 {

	public static void main(String[] args) {

		int x=29,y=21,c=31;
		
		if (x>y&&x>c)
		{
			System.out.println("The greater number is : "+x);
		}
		else if(y>x&&y>c)
		{
			System.out.println("The greater number is :"+y);
		}
		else if (c>x&&c>y)
		{
			System.out.println("The greater number is "+c);
		}

	}

}
