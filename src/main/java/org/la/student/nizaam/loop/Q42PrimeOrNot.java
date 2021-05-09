package org.la.student.nizaam.loop;

public class Q42PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	42.	wap to find given number is prime or not
		
		int num=7,count=0,mid;
		if(num%2==0) {
			mid=num/2;
		}else {
			mid=(num/2)+1;
		}
		
		
		for(int i=1;i<=mid;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");

	}

}
