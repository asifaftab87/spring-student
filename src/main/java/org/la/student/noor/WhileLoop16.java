package org.la.student.noor;
//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
public class WhileLoop16 {

	public static void main(String[] args) {
		int n=70;
		int i=10;
		while(i<n) {
			if(i%3!=0 && i%5!=0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
