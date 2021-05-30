package org.la.student.noor;
/*void printStarReverseRight(int n)
print star in decreasing order from right*/

public class MethodQ27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printStar(n);

	}
	static void printStar(int n) {
		for(int i=n;i>0;i--) {
			for(int j=n;j>0;j--) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
