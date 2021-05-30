package org.la.student.muhammad.abdullahi.ternary;

public class loopQ67 {
	public static void main(String[] args) {
		
		 
		  
		  
		 int sum=0,k,j,i,n=22;
			
			System.out.println("The prime number between  "+n+" are :");
	        
			for(i=2;i<n;i++)
	        {
	            k=0;
	            for(j=2;j<i;j++)
	            {
	                if(i%j==0)
	                {
	                    k=1;
	                    break;
	                }
	            }
	            if(k==0)
	            {
	            	System.out.print(j+"  ");
	               
	            }
	        }
	        System.out.println(sum);
		
		
			}
		
	    
	}
		
	
		
		
		
		
		
		
		
		
		
		
	

