package org.la.student.sajid;

public class CheckStrongNumber {
	public static void main(String[] args) 
	{
//		Wap to check whether a number is Strong number or not.
		
		int num=145,r,i,f,s=0;
		int n=num;
		while(n>0) 
		{
			f=1;
			i=1;
			r=n%10;
			while(i<=r) 
			{
				f*=i;
				i++;
			}
			s+=f;
			n/=10;
		}
		if(num==s)
		{
			System.out.println("Strong Number: "+s);
		}else
			System.out.println("Not strong Number: "+num);
		
	}

}
