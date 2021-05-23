package org.la.student.nizaam.loop.whilee;

public class Q70PrintArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	70.	Wap to print all Armstrong numbers between 1 to n.
		
		int n= 400,res=0,r,temp,num;
		
		for(int i=0;i<=n;i++)
		{
			num=i;
			temp=num;
			res=0;
			while(num>0) {
				r=num%10;
				num=num/10;
				res = res+ r*r*r;
			}
			if(temp==res)
				System.out.println(res);
			
		}
		
	}

}
