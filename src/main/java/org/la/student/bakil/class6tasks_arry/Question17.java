package org.la.student.bakil.class6tasks_arry;
/*
 * wap to copy two arrays into one array
 */
public class Question17 {

	public static void main(String[] args) {
	
		int a1[] = {2,9,11,30,43};
		int a2[] = {7,11,23,99,34};
		
		int a3 [] = new int [a1.length+a2.length];
		
		int i=0;
		
		for (i=0;i<a1.length;i++) {
			
			a3[i] =a1[i];
		}
	
		for (int x=0; x<a2.length;x++) {
			a3[x+i]= a2[x];
		}
		
		for (int w=0; w<a2.length;w++) {
			a3[w]= a2[w]+a1[w];
		}

		for (int y : a3){
		System.out.print(y+" ");
 		    }
		}
	}
		

