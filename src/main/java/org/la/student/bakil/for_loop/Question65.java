package org.la.student.bakil.for_loop;
/*
 * Wap to print all Prime numbers between 1 to n.
 */
public class Question65 {

	public static void main(String[] args) {

		int i,count,n = 44;
      
        System.out.println("Prime numbers between 1 to "+n+" are ");
        for(int j=2;j<=n;j++)
        {
        	count=0;
        	for(i=1;i<=j;i++)
        	{
        		if(j%i==0)
        		{
        		count++;        
        		}
        	}
        	if(count==2)
        		System.out.print(j+"  ");
        }
		  }
}

