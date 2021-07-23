package org.la.student.barry.stream;

import java.util.List;

import org.la.student.barry.util.UtilClass;

public class SumStream2 {
	public static void main(String[] args) {
		
		List<Integer> list = UtilClass.getListInterger();
		list.stream()
		   .map(x -> x*x)
		   .forEach(System.out :: println);
		
	}

}
