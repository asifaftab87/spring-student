package org.la.student.nizaam.loop;

public class Q72AllPerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	72.	Wap to print all Perfect numbers between 1 to n.
		
		int n=10000,sum=0,num;
		
		for(int j=1; j<n;j++ )
		{
			num=j;
			sum=0;
			for(int i=1;i<num;i++) {
				if(sum>num)
					break;
				if(num%i==0) {
					sum=sum+i;
				}
			}
			if(num==sum)
				System.out.print(num+",");
			

		}
		
	}

}
