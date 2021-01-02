package org.la.student.asif.scope;

public class Scope {

	public static void main(String[] args) {
		
		boolean b = true;
		
		{
			int a = 5;
		}
		
		int a = 4;
		
		{
			a = 6;
		}
		
		
	}
}
