package org.la.student.tahir.method;

public class Largestnumberwithinanarray {
	//Largest element in an array.
	public static void main(String[] args) {
		
		arg();	
	}
	
	
	static void arg () {
		
		int array[] = new int[5];
		int i=0;
		int grt=0;
	for (; i<array.length;i++)	{
		
		array[i]= i+1;
		System.out.println(array[i]);
	
	for(int j=1; j<i;j++) {
		if(array[i]>array[j]) {
			 grt=array[i];
		}
		else
			grt=array[j];
			
	}
	
	
	
	}
	System.out.println("The largest element in the array is : " + grt);
	}

}
