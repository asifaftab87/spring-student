package org.la.student.sadique.clas;

public class TestSpecificArrayElemenet {

	public static void main(String[] args) {
		//  Write a Java program to test if an array contains a specific value
		int md[]=new int[] { 1,2,4,7,8,3};
		int special= 3;
		for(int a=0;a<md.length;a++) {
			if(special==md[a]) {
				System.out.println(md[a]+" : Yes This is Special");
			}
		}
 
	}

}
