package org.la.student.noor;

public class DiamondStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for(int i=-n;i<=n;i++){ 
        	
        	int j=i;
        	if(j<0) {
        		j = -j;
        	}
        	//printing space
        	for(int k=1;k<=j;k++) {
        		System.out.print(" ");
        	}
        	
        	//printing star
        	for(int k=0;k<=n-j;k++) {
        		System.out.print("* ");
        	}
        	
        	 System.out.println("");
        }
	}
}
