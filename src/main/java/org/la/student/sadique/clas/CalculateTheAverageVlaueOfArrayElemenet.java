package org.la.student.sadique.clas;

public class CalculateTheAverageVlaueOfArrayElemenet {

	public static void main(String[] args) {
		//  Write a Java program to calculate the average value of array elements.
		int num [] = new int[] {13,28,34,54,21};
		int total=0;
		int avrg=0;
		int reng = num.length;
		
		for( int a=0;a<num.length;a++) {
			total=total+num[a];
		} System.out.println("Sum Of All Element");
		System.out.println( total);
// calculate the average of value of array element.
		avrg=total/reng;
		System.out.println("Average value");
		System.out.println(avrg);
		
	}

}
