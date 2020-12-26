package org.la.student.sajid;

public class CheckArmstrongNumberOfN {
	public static void main(String[] args) {
//		Wap to print all Armstrong numbers between 1 to n.
		int r,s=0,num;
		
		for(int a=1;a<=1000;a++) {
			
			num=a;
			
			while(num>0) {
				
					r=num%10;
					s+=(r*r*r);
					num/=10;
					
			}if(s==a) {
				System.out.println("Armstrong Number: "+s+" ");
			}
			
			s=0;
			
		}
	}

}
