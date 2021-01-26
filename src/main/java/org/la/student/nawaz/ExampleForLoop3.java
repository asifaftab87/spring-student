package org.la.student.nawaz;

public class ExampleForLoop3 {
	
	public static void main(String[] args) {
		
		for (int i=5;i<=15;i++)
			
		{
			if ((i+2)%2==0)
			continue;
			
			else
				System.out.print(i+ " ");
			
		}		
	}

}
