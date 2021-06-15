package org.la.student.barry.method.task;

public class EvenOddNumberTask {
	public static void main(String[] args) {
		printOdds();
		printEven();
	} 
	static void printOdds() {
		int a[]={1,2,5,6,3,2}; 
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		   } 
    	 } 
	  }
	
	static void printEven() {
		int a[]={1,2,5,6,3,2}; 
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
	}

}
