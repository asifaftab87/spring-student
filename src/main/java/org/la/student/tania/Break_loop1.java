package org.la.student.tania;

public class Break_loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=40;
while(n>=1) {
	if (n==35) {
		break;
	}
	System.out.println("n: " +n);
	n--;
}
System.out.println("outside of the loop n: " +n);
	}

}
