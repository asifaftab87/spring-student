package org.la.student.sadique;

public class GreatestNumberAmoungThreeNumber {
       //wap to find greatest number among three number.
	public static void main(String[] args) {
		// using without loop.
		int x=32,y=99,z=159;
		int w=(x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println(w +" is greatest number");

	// using loop.
	int a=87
			,b=24,c=36;
	for(;a>b && a>c;) {
		System.out.println(a + " is greatest number");
		break;
	}
	for(; b>c && b>a;){
		System.out.println(b + " is greatest number");
		break;
	}
	for(; c>b && c>a;){
		System.out.println(c + " is greatest number");
		break;
	}
	
    }
	}

