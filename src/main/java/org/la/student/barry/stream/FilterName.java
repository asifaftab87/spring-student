package org.la.student.barry.stream;

import java.util.List;

import org.la.student.barry.util.UtilClass;

public class FilterName {
	public static void main(String[] args) {
		
		List<String> names = UtilClass.getListString();
		names.stream()
		    .filter(x -> x.startsWith("m"))
		    .map(x -> x.toUpperCase())
		    .forEach(System.out :: println);
		
	}

}
