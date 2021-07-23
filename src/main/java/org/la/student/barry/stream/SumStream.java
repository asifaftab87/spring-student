package org.la.student.barry.stream;

import java.util.List;

import org.la.student.barry.util.UtilClass;

public class SumStream {
	public static void main(String[] args) {
		
		List<Integer> list = UtilClass.getListInterger();
		list.stream()
		   .forEach(System.out :: println);
		
	}

}
