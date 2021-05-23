package org.la.student.nizaam.array;

import java.util.Arrays;

public class Q23Occurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	23) Write a java program to count occurrences of each element in an array?
		
		int a[]= {1,2,3,2,2,1,2,3,4,3,2,1};
		Arrays.sort(a);
		int count,num;
		
		int b[]=new int[a.length];
		int index=0;
		for(int x=0;x<a.length;x++) {
			while(x<a.length-1 && a[x]==a[x+1])
				x++;
			b[index]= a[x];
			index++;
		}
		
		
		for(int i=0; i<b.length;i++) {
			count=0;
			if(b[i]==0)
				break;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j])
					count++;
			}
			
			System.out.println(b[i] + " is present "+ count +" time(s)" );
		}
	}

}
