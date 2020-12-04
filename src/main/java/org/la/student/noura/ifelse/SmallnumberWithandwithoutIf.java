package org.la.student.noura.ifelse;

public class SmallnumberWithandwithoutIf {

	public static void main(String[] args) {
		//wap to print smallest number among two given numbers( with if and without if)
		
		int a=3  ,b=6;
		if (a<b) {
			System.out.println(a+ "  is the smallest number");
		}
		
		else {			System.out.println(b+ "  is the smallest number");
}
		
		// without if
		
		int x=87 , z= 55;
		
		int small= x<z?x:z;
		System.out.println("the smallest number is  "+ small);

		
	}

}
