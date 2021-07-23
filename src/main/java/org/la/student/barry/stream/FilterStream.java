package org.la.student.barry.stream;

import java.util.List;

import org.la.student.barry.util.UtilClass;

public class FilterStream {
	public static void main(String[] args) {
		
		List<Integer> list = UtilClass.getListInterger();
		list.stream()
		   .filter(a -> a>5)
		   .forEach(System.out :: println);
		
	}

}
