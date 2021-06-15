package org.la.student.noor;
/*void printIncrStar(int n)
print star patter*/

public class MethodQ24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printStar(n);

	}
	static void printStar(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
