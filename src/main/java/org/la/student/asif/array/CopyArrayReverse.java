package org.la.student.asif.array;

public class CopyArrayReverse {

	public static void main(String[] args) {
		
		char src[] = {'q', '2', '%', '-'};
		char tar[] = new char[src.length];
		
		int l = src.length-1;
		
		for(int i=0 ; i<src.length ; i++) {
			tar[i] = src[l-i];
		}
		
		for(char c : tar) {
			System.out.println(c);
		}
		
	}
}
