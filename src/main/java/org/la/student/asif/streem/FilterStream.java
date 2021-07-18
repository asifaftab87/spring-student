package org.la.student.asif.streem;

import java.util.List;

import org.la.student.asif.util.UtilClass;

public class FilterStream {

	public static void main(String[] args) {
		
		List<Integer> list = UtilClass.getListInteger();
		
		list.stream()
			.filter(a -> a>5)
			.forEach(System.out::println);
	}
}
