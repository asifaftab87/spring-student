package org.la.student.asif.array;

public class CopyArray {

	public static void main(String[] args) {
		
		char src[] = {'q', '2', '%', '-'};
		char tar[] = new char[src.length];
		
		for(int i=0 ; i<src.length ; i++) {
			tar[i] = src[i];
		}
		
		for(char c : tar) {
			System.out.println(c);
		}
		
	}
}
