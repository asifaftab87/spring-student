package org.la.student.noura.clas;

public class Dimond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dimond obj=new Dimond();
		obj.diamond(5);
	}


	public void diamond(int n) {

		for(int i=-n;i<=n;i++) {
			int k=i;
			if(k<0) 
				k=-k;
				for(int j=0;j<=k;j++) {
					System.out.print(" ");
				}
				for(int j=k;j<=n;j++) {
					System.out.print("* ");
				}
				System.out.println(" ");
			
		}
		
	}
	
}


