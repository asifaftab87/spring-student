package org.la.student.aqsa;
import java.io.*;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionArrayList {

void add(int index, Object element) {}
//It is used to insert the specified element at the specified position in a list.

boolean add(Object e){
	return false;} 
//It is used to append the specified element at the end of a list.

boolean addAll(Collection<? extends Object> c) {
	return false;}
//	It is used to append all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.

boolean addAll(int index, Collection<? extends Object> c) {
	return false;}
//It is used to append all the elements in the specified collection, starting at the specified position of the list.

void clear() {}
//It is used to remove all of the elements from this list.

void ensureCapacity(int requiredCapacity) {}
//It is used to enhance the capacity of an ArrayList instance.

Object get(int index) {
	return null;}	
//It is used to fetch the element from the particular position of the list.

boolean isEmpty() {
	return false;}	
//It returns true if the list is empty, otherwise false.

void Iterator(){}
void listIterator(){}	

int lastIndexOf(Object o) {
	return 0;}	
//It is used to return the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.

Object[] toArray() {
	return null;}	
//It is used to return an array containing all of the elements in this list in the correct order.

<T> T[] toArray(T[] a) {
	return a;}	
//It is used to return an array containing all of the elements in this list in the correct order.

protected Object clone() {
	return null;}	
//It is used to return a shallow copy of an ArrayList.

boolean contains(Object o) {
	return false;}	
//It returns true if the list contains the specified element

int indexOf(Object o) {
	return 0;}	
//It is used to return the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.

Object remove(int index) {
	return null;}	
//It is used to remove the element present at the specified position in the list.

boolean remove(Object o) {
	return false;}	
//It is used to remove the first occurrence of the specified element.

boolean removeAll(Collection<?> c) {
	return false;}	
//It is used to remove all the elements from the list.

boolean removeIf(Predicate<? super Object> filter) {
	return false;}	
//It is used to remove all the elements from the list that satisfies the given predicate.

protected void removeRange(int fromIndex, int toIndex) {}	
//It is used to remove all the elements lies within the given range.

void replaceAll(UnaryOperator<Object> operator) {}	
//It is used to replace all the elements from the list with the specified element.

void retainAll(Collection<?> c) {}	
//It is used to retain all the elements in the list that are present in the specified collection.

Object set(int index, Object element) {
	return element;}	
//It is used to replace the specified element in the list, present at the specified position.

void sort(Comparator<? super Object> c) {}	
//It is used to sort the elements of the list on the basis of specified comparator.

Spliterator<Object> spliterator(){
	return null;}	
//It is used to create spliterator over the elements in a list.

List<Object> subList(int fromIndex, int toIndex){
	return null;}	
//It is used to fetch all the elements lies within the given range.

int size() {
	return 0;}	
//It is used to return the number of elements present in the list.

void trimToSize(){}	
//It is used to trim the capacity of this ArrayList instance to be the list's current size.
	


	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("A");
		a1.add("B");
		a1.add("A");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		System.out.println(a1);//[A, B, A, C, D, E]
		
		for(Object l : a1) {
			System.out.println(l);
		}

		a1.remove(0);//[B, A, C, D, E]
		System.out.println(a1);
		
		a1.remove(2);//[B, A, D, E]
		System.out.println(a1);
		
		a1.add(0,"87" );//[87, B, A, D, E]
		System.out.println(a1);
		
		/*
		 *  Usually we can use collection to hold and transfer objects from one tier to another
         *  tier. To provide support for this requirement every Collection class already
         *   implements Serializable and Cloneable interfaces.
		 */
		
		LinkedList a2=new LinkedList();
		
		System.out.println(a1 instanceof Serializable ); //true
		System.out.println(a1 instanceof Cloneable); //true
		
		System.out.println(a2 instanceof Serializable ); //true
		System.out.println(a2 instanceof Cloneable); //true
		
		/*
		 *  ArrayList and Vector classes implements RandomAccess interface so that any
           random element we can access with the same speed. Hence ArrayList is the best
           choice of "retrieval operation".
            RandomAccess interface present in util package and doesn't contain any methods.
           It is a marker interface.
		 */
		
		System.out.println(a1 instanceof RandomAccess); //true
		System.out.println(a2 instanceof RandomAccess); // false
		
		
		ArrayList l = new ArrayList<>();
		
		l.add(0, "Kolkata");
				
		l.add(1, "Delhi");
		
		l.add("Mumbai");
		
		System.out.println(l);//[Kolkata, Delhi, Mumbai]
	
		l.ensureCapacity(10);
		
		
		System.out.println(l.get(2));//Mumbai
		
		System.out.println(l.isEmpty());//false
	
		Object l2 = l.clone();
		System.out.println(l2);//[Kolkata, Delhi, Mumbai]
		
		System.out.println(l.lastIndexOf("UP"));//-1
		
		l.add("UP");//
		System.out.println(l);//[Kolkata, Delhi, Mumbai, UP]
		
		System.out.println(l.contains("UP"));//true
		
		System.out.println(l.size());//4
		
		l.trimToSize();
		System.out.println(l.size());
		
		
	
	}
}
