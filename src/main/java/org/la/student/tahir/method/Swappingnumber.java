package org.la.student.tahir.method;

public class Swappingnumber {
	//Accept an argument
	public static void main(String[] args) {
		
		int x =24;
		
		arg(x);
	
		
		
	}
	
	
	static void arg (int a) {
		
		int z=0;
		while(a>0) {
			
			int r = a%10;
			a= a/10;
			z= z*10+r;
		}
		
		
		System.out.println(z);
		
	}
	

}
