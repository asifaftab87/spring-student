package org.la.student.barry.array;

public class CopyArray {

	public static void main(String[] args) {
	  char src[]= {'a','2','%','-'};
	  char tar[]= new char[src.length];
	  
	  for(int i=0; i<src.length; i++) {
		  tar[i]= src[i];
	  }
         for(char c : tar) {
        	 System.out.println(c);
         }
	}

}
