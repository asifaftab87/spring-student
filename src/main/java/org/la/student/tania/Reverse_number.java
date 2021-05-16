package org.la.student.tania;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=87659;
int res = 0;
for(; n>0 ;) {
	int r = n%10;
	n=n/10;
	res=res*10+r;
} 
 System.out.println("reverse num: " +res);
	}

}
