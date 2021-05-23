package org.la.student.nizaam.loop;

public class Q74AllStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	74.	Wap to print all Strong numbers between 1 to n.
		
		int n = 100000,fact,num,sum=0,temp,j;
		
		for(int k=1; k<n;k++) {
			sum=0;
			j=k;
			temp=j;
			while(j>0) {
				num=j%10;
				fact=1;
				for(int i=0; i<num;i++) {
					fact=fact*(num-i);
				}
				j=j/10;
				sum=sum+fact;
			}
			if(temp==sum)
				System.out.print(temp+",");
			
		}
		
	}

}
