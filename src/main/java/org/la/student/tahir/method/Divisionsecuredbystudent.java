package org.la.student.tahir.method;

public class Divisionsecuredbystudent {
	//wap to find divistion secured by a student
	
	public static void main(String[] args) {
		
		int x =67;
		Score (x);
		
		
	}
	
	
	static void Score (int a) {
		
		if(a>=70)
			System.out.println("A");
		else if(a>=60 && a<70)
			System.out.println("B");
		else if(a>=50 && a<60)
			System.out.println("C");
		else if(a>=40 && a<50)
			System.out.println("D");
		else
			System.out.println("F");
	}
	
	
}
