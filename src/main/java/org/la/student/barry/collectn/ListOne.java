package org.la.student.barry.collectn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOne {
	
  public static void main(String[] args) {
	  List<String> list = new ArrayList<>();
	  list.add("Elhadj");
	  list.add("Abdoulaye");
	  list.add("Alam");
	  list.add("Alam");
	  Collections.sort(list);
	  System.out.println(list.get(0));
	  System.out.println(list.get(1));
	  System.out.println(list.get(2));
	  System.out.println(list.get(3));
	 
	  
	
}

}