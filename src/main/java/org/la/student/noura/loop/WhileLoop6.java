package org.la.student.noura.loop;

public class WhileLoop6 {

	public static void main(String[] args) {

		//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5
		
		int a =10;
		while (a<=70)
		{
			if(a%3!=0 && a%5!=0) {
				System.out.println(a);
				
			}
				a++;
		}
		
	}

}
