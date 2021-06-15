package org.la.student.rasheed;

public class CopyArrayReverseOrder2 {

	public static void main(String[] args) {
		
		char ace [] = {1, 2, 3};
		char bar [] = new char[ace.length];
		
		int c = ace.length-1;
		
		for (int i=0; i<ace.length; i++) {
			bar[i] = ace [c-i];
			
		}


	for (char d : bar) {
		System.out.println(d);
	}
	
	}

}
