package org.la.student.noor;
/*void diamond(int n)
print diamond*/

public class MethodQ28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printStar(n);

	}
	static void printStar(int n) {
		int j=0;
		for(int i=-n;i<=n;i++) {

			if(i<0)
				j=-i;
			else
				j=i;
			//printing space
			for(int k=1 ; k<=j ; k++) {
				System.out.print(" ");
			}
			//printing star
			for(int k=0 ; k<=n-j ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
