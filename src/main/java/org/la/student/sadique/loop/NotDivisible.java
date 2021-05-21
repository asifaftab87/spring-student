package org.la.student.sadique.loop;
//wap to print all numbers between 30 to 50 those are not divisible by 7.
public class NotDivisible {

	public static void main(String[] args) {
		int num;
		for( num=30;num<=50;num++) {
			if(num%7!=0)
				System.out.println(num+" Is Not DivisibleBy 7 ");
		}System.out.println(" ");
		//wap to print all numbers between 130 to 90 those are not divisible by 10.
		for( num=130;num>=90;num--) {
			if(num%10!=0)
				System.out.println("These number "+num+" is not DivisibleBy 10");
		}System.out.println(" ");
		//wap to print all numbers between 10 to 70 those are not divisible by 3 and 5.
		for( num=10;num<=70;num++) {
			if(num%3!=0 && num%5!=0)
				System.out.println(num+" Is Not DivisibleBy 3 and 5 ");
		}System.out.println(" ");
		//wap to print all numbers between 10 to 90 those are not divisible by 2 and 5.
		for( num=10;num<=90;num++) {
			if(num%2!=0 && num%5!=0)
				System.out.println(num+" Is Not DivisibleBy 2 and 5 ");
		}System.out.println(" ");
		//wap to print all numbers between 100 to 1 those are not divisible by 11 and 3.
		for( num=100;num>=1;num--) {
			if(num%11!=0 && num%3!=0)
				System.out.println(num+" Is Not DivisibleBy 11 and 3 ");
		}System.out.println(" ");
	}

}
