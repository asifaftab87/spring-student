package org.la.student.rasheed;

public class ArrayRecursionError {

	public static void main(String[] args) {
		ArrayRecursionError rc = new ArrayRecursionError();
		//the value we are passing is (5)
		rc.fact(5);
	}
		// Whenever you call a method itself, any variable has a local variable
	//inside the below body, everytime it will create that variable, in this situation you have to modify the variable
	//void fact (int n) {
		
	void fact(int n) {
		n--;//Here we are decreasing the value, to (--;)
		
		
		System.out.println(n);//Here it printing the value been decreased which (4)
		
		
		if(n>0) {//Here it checking if (n) which is 4 greater than 0
		
			// you send the value in here in fact line
			
		fact(n);//Here you are calling this method again with (n)
		}
	return;//void method can return a value
	

}
}
