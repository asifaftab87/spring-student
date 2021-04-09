package org.la.student.aqsa;

import java.util.LinkedList;

public class CollectionLinkedList {
	
	/*
	 * Usually we can use LinkedList to implement Stacks and Queues.
       To provide support for this requirement LinkedList class defines the following 6 specific
       methods.
       1. void addFirst(Object o);
       2. void addLast(Object o);
       7. void add(int index, Object o);
       8. void addAll(Collection c);
       9. void set(int index, Object o);
       3. Object getFirst();
       4. Object getLast();
       5. Object removeFirst();
       6. Object removeLast();
	 */
	
public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("ashok");
		l.add(30);
		l.add(null);
		l.add("ashok");
		l.add(4, "kamal");
		l.add(4, "k");
		
		System.out.println(l);//[ashok, 30, null, ashok, k, kamal]
		
		l.set(0,"software");
		System.out.println(l);//[software, 30, null, ashok, k, kamal]
		
		l.set(0,"venky");
		System.out.println(l);//[venky, 30, null, ashok, k, kamal]
		
		l.removeLast();
		System.out.println(l);//[venky, 30, null, ashok, k]
		
		l.addFirst("vvv");
		System.out.println(l);//[vvv, venky, 30, null, ashok, k]
		
		l.remove(4);
		System.out.println(l);//[vvv, venky, 30, null, k]
		
		System.out.println(l.getFirst());//vvv
		
		System.out.println(l.getLast());//k
}
}
