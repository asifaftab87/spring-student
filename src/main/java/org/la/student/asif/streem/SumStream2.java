package org.la.student.asif.streem;

import java.util.List;

import org.la.student.asif.util.UtilClass;

public class SumStream2 {

	public static void main(String[] args) {
		
		List<Integer> list = UtilClass.getListInteger();
		
		list.stream()
			.map(x -> x*x)
			.forEach(System.out::println);
	}
}
