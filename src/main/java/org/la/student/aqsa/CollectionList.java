package org.la.student.aqsa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*Lists are probably the most widely used Java collections in practice. A list is a collection
which—unlike a set—can contain duplicates, and which—unlike a queue—gives the
user full visibility and control over the ordering of its elements
*/

public class CollectionList {
	
	
	/*
	 * Positional Access:
	 *  Methods that access elements based on their numerical position in the list:*/
	void add(int index,  Integer e) { } // add element e at given index
	boolean addAll(int index1, Collection<? extends Integer> c) {
		return false;} // add contents of c at given index
	Integer get(int index) {
		return index;} // return element with given index
	Integer remove(int index) {
		return index;} // remove element with given index
	Integer set(int index, Integer e) {
		return e;} // replace element with given index by e

	
	
 /* Search Methods:
  *  that search for a specified object in the list and return its numerical position.
  *  These methods return -1 if the object is not present:*/
int indexOf(Object o) {
	return 0;} // return index of first occurrence of o
int lastIndexOf(Object o) {
	return 0;} // return index of last occurrence of o



/*Range-View A method that gets a view of a range of the list:*/
List<Integer> subList(int fromIndex, int toIndex){
	return null;}  // return a view of a portion of the list

public static void main(String[] args) {
	
	
	List l = new ArrayList();
	l.add(5);
	l.add(6);
	List ll = new ArrayList();
	ll.add(7);
	System.out.println(ll);
	System.out.println(l);
	System.out.println(ll.add(l));
	System.out.println(ll);
	System.out.println(l);
	
	System.out.println(ll.addAll(2, l));
	System.out.println(ll);
	
	
	System.out.println(ll.addAll(1, l));
	System.out.println(ll);
	
	System.out.println(l.subList(0, 2));
	
	
	
	
	List l1 = new ArrayList();
	
	l1.add(0, "Mango");// [Mango]
	System.out.println(l1);
	
	l1.add(1, "Apple" );//[Mango, Apple]
	System.out.println(l1);
	
	l1.add("Pineapple");
	
	l1.add("Guava");
	
	l1.add("Grapes");
	System.out.println(l1);//[Mango, Apple, Pineapple, Guava, Grapes]
	
	System.out.println(l1.get(1));//Apple
	
	l1.remove(0);
	System.out.println(l1);//[Apple, Pineapple, Guava, Grapes]
	
	l1.set(3, "Apple");
	System.out.println(l1);//[Apple, Pineapple, Guava, Apple]
	
	
	
	System.out.println(l1.indexOf("Apple"));//0
	
	System.out.println(l1.lastIndexOf("Apple"));//3


	System.out.println(l1.subList(0, 2));//[Apple, Pineapple]
}


}


