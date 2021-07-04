package org.la.student.rasheed.clas;

public class OverloadingMain {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.sum();
		overloading.sum(1, true);
		overloading.sum(1, 2, 3);
		//Here it will go to that specific method
//If you hold the Ctrl button and you click your mouse on sum it will take you to the specific method where it located
	}

}
