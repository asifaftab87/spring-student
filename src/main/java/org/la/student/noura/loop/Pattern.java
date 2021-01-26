package org.la.student.noura.loop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int m=n+1;
		int k=0;
		
		for(int i=0;i<n;++i) {
			for(int j=n-i;j>0;--j) {System.out.print("-");
			}
			for (int j=n-1;j>0;--j) {
				System.out.print(++k +"*");
			}
			int h=n*m-k+1;
			for(int j=n-i;j>0;--j) {
				if(j!=n-1)
				System.out.print("*"+h++);
			else
					System.out.print(h++);
			}
			System.out.println();
		}
	}

}
