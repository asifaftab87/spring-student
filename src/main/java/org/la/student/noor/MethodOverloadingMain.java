package org.la.student.noor;

public class MethodOverloadingMain {
	public static void main(String[] args) {

		MethodOverloading moverloading = new MethodOverloading();
		moverloading.sum();
		moverloading.sum(1, true);
		moverloading.sum(1, 2, 3);
		moverloading.sum(true, false);
		moverloading.sum(false, 12);
		moverloading.sum(4, 8);
	}
}
