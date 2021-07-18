package org.la.student.asif.streem;

import java.util.List;

import org.la.student.asif.util.UtilClass;

public class FilterName {

	public static void main(String[] args) {
		
		List<String> names = UtilClass.getListString();
		names.stream()
			.filter(x -> x.startsWith("a"))
			.map(x -> x.toUpperCase())
			.forEach(System.out::println);
	}
}
