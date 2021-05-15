package org.la.student.jamal.array;

public class array19 {
	
	//19) Write a java program to find duplicate elements in an array? 

	public static void main(String[] args) {
		
		int a[]= {1,2,2,3,1,4,5,6,6};
		for (int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==(a[j])) {
					System.out.println(a[j]);
					
				}
			}
			
		}
		
		
		

	}

}
