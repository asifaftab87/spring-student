package org.la.student.sadique;

public class StrongNumber {

		public static void main(String[] args) {
			
			int num=145,temp,rem,sum=0,i,f=1;
			temp=num;
			while(temp!=0) {
				rem=temp%10;
				f=1;
				for( i=1;i<=rem;i++) {
					f=f*i;
				}
				sum=sum+f;
				temp=temp/10;
			}
			if(sum==num)
			System.out.println(sum + " is strong number");
			else
				System.out.println(sum + "is not strong number");


	}

}
