package org.la.student.nizaam.loop;

public class Q42PrintAllPrimes_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print all prime numbers between 1 to 100
		
		int mid,num;
		for(int i=2;i<=100;i++) {
			num=i;
			int count =0;
			if(num%2==0) {
				mid=num/2;
			}else {
				mid=(num/2)+1;
			}
			
			
			for(int j=1;j<=mid;j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count<2)
				System.out.print(num+",");
		}

	}

}
