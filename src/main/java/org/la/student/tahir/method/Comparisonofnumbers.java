package org.la.student.tahir.method;

public class Comparisonofnumbers {
	//Comparison
	public static void main(String[] args) {
		
		int x =2, y=3, z=4;
		
		System.out.println("Numbers are : "+x+" "+" "+y+" "+" "+z);
		
		greatestof3(x,y,z);
		Smallestof3 (x,y,z);
		Smallestof2 (x,y);
		greatestof2 (z,y);
	
	
		
	}
	
	
	static void greatestof3 (int a, int b, int c) {
	//	wap to find to find greatest among three numbers
		
		System.out.println("Between 3 numbers");
		if (a>b && a>b) {
			System.out.println(a+" is greatest");
		}
		
		else if(b>a && b>c) {
			System.out.println(b+ " is greatest");
		}
		
		else
			System.out.println(c + " is greatest");
		
		
	}
	
	
	static void Smallestof3 (int a, int b, int c) {
		
		System.out.println("Between 3 numbers");
		
		if (a<b && a<b) {
			System.out.println(a+" is smallest");
		}
		
		else if(b<a && b<c) {
			System.out.println(b+ " is smallest");
		}
		
		else
			System.out.println(c + " is smallest");
		
		
	}
	
	static void Smallestof2 (int a, int b) {
		
		System.out.println("Between first 2 numbers");
		
		if (a<b ) {
			System.out.println(a+" is smallest");
		}
		
		else  {
			System.out.println(b+ " is smallest");
		}
	}
	
static void greatestof2 (int a, int b) {
		
		System.out.println("Between last 2 numbers");
		
		if (a>b ) {
			System.out.println(a+" is greatest");
		}
		
		else  {
			System.out.println(b+ " is greatest");
		}
	}
	
	

	
}
