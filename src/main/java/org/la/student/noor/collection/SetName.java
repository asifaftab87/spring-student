package org.la.student.noor.collection;
import java.util.HashSet;
import java.util.Set;

public class SetName {

	public static void main(String[] args) {

		Set<Integer> setInt = new HashSet<>();
		setInt.add(3);
		setInt.add(4);
		setInt.add(5);
		setInt.add(4);
		setInt.add(3);
		setInt.add(1);
		print(setInt);
	}

	static void print(Set<Integer> set) {
		for(Integer i : set) {
			System.out.println(i);
		}
	}

}
