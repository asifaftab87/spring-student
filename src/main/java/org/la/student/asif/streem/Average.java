package org.la.student.asif.streem;

import java.util.stream.IntStream;

import org.la.student.asif.util.UtilClass;

public class Average {

	public static void main(String[] args) {
		
		IntStream streamInt = UtilClass.getStreamInt();
		streamInt
        	.average()
        	.ifPresent(System.out::println);
	}
}
