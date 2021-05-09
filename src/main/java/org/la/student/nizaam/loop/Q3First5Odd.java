package org.la.student.nizaam.loop;

public class Q3First5Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	3.	wap to print first five odd numbers.
		
		int count=0;

		for(int i=1;count<5;i++) {
			if(i%2!=0) {
				System.out.println(i);
				count++;
			}
		}
	}

}
