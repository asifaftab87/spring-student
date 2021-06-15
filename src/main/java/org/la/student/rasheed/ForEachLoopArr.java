package org.la.student.rasheed;

public class ForEachLoopArr {

	public static void main(String[] args) {
		
		int a [] = {2, 3, 1, 77, 22,9228};
		
		for (int x=0; x<a.length; x++) {
				System.out.println(a[x]);
		}
		//name is for each 
		for (int i: a) {
			System.out.println(i);
			
		}
		

	}

}
