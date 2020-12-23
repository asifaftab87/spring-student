package org.la.student.tahir.loop_programs;

public class For_Loop_64 {

	public static void main(String[] args) {
		
		//Wap to print all Perfect numbers between 1 to n.
		
		int a = 9000;
		
		for(int s=1; s<=a; s++){
		int n=s;
		int sum =0;
		
		for(int i=1; i<=n/2; i++) {
			
			if (n%i ==0) {
				
				sum = sum + i;
			}
		}
			
			if(sum==n) {
				System.out.println(n +"Perfect");
			}
	}
}

}