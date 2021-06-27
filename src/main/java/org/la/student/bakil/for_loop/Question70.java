package org.la.student.bakil.for_loop;
/*
 * Wap to check whether a number is Perfect number or not
 */
public class Question70 {

	public static void main(String[] args) {

	int i, sum=0;
	
	for(int j=2;j<=900;j++) {
		sum=1;
		for(i=2;i<j;i++)
		{
			if (j%i==0)
				sum=sum+i;
			
		}
		if (j==sum) 
			System.out.println(j+" The number is perfect");
	
	
	
	
	
	
	
	
	}
	}}
