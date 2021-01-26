package org.la.student.noura.array;

public class CheckTwoArrayareEqualorNot {

	public static void main(String[] args) {
		
		//wap to check whether two array are equal or not(means we have to check each element of two arrays)?

		
		int a[]= {3,4,7,6};
		int b[]= {3,4,8,6};
		int equal=0;
	  
		
		if (a.length==b.length) {
			
			for(int i =0;i<a.length;i++) {
				
				if(a[i]!=b[i]) {
					equal=1;
				    break;
				}

				else {
					equal=0;
				     };
				    
			}	
			
		}
		if (equal==0) {System.out.println("Two arrays are equal");}
		else System.out.println("not equal");
				    
	   }
		
	
	}

