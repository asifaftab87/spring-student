package org.la.student.sajid.coll;

import java.util.ArrayList;
import java.util.List;

public class MyList2 {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		
		list.add(12);
//		list.add(96.25f);       // dont add different data type in same array lis
		list.add(9);
		list.add(45);
		list.add(55);
		list.add(23);
		
		int i=(int) list.get(0);
		float f=(float)list.get(1);
		
		for(int k=0;k<list.size();k++) {
//			int j=(int)list.get(k);              // it will throw error
			int j=list.get(k);   
			System.out.println("j: "+j); 
		}
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
//		System.out.println(list.get(5));
	}

}
