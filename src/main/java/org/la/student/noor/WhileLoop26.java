package org.la.student.noor;
//wap to find sum of a number e.g ip=1234,  op=10
public class WhileLoop26 {

	public static void main(String[] args) {
		int n=1234,sum=0,m;
		while(n>0)    
		{    
		m=n%10;    
		sum=sum+m;    
		n=n/10;    
		}    
		System.out.println(sum); 

	}

}
