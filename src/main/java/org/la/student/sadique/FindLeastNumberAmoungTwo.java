package org.la.student.sadique;

public class FindLeastNumberAmoungTwo {

	//wap to find least number among two numbers.
	
	public static void main(String[] args) {
		//using if and else.
		int a=12;
		int b=32;
		if(a<b) {
			System.out.println(a +" is least number");
		} else {
			System.out.println(b +" is least number");
		}
		//using without if and else (loop)
		int y=43;
		int z=74;
		for(;y<z;) {
			System.out.println(y+" is least number then "+z);
			break;
		}
		for(;z<y;) {
			System.out.println(z+" is least number then "+y);
			break;

		}
	}

}
