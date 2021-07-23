package org.la.student.barry.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.la.student.barry.util.UtilClass;

public class Average {
	public static void main(String[] args) {
		
		
		IntStream streamInt = UtilClass.getStreamInt();
		  streamInt
		    .average()
		    .ifPresent(System.out :: println);
		  
	}

}
