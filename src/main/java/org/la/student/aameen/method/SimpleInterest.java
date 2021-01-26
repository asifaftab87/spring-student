package org.la.student.aameen.method;



public class SimpleInterest {

	public static void main(String[] args) {
		// Write a java program to create a method that calculate Simple Interest for the given year with particular rate and principle   

		
		 interest();
	}
	static void interest()
	{
	float principle = 10000,rate = 4,time = 1;
	float simpleinterest = (principle*rate*time)/100;
	System.out.println("Simple interest of given year : " +simpleinterest);
	return ;
	}
	
}
