package org.la.student.aameen.oop;

public class Book 
	{
	
	public double price ;
	public String author;
	public int numofPages;
	
	public void display() 
	{
		System.out.println(" price : " +price);	
		System.out.println("  author : " +author);
		System.out.println(" numofPages : " +numofPages);		//	int i = 5;
														//	System.out.println("This is the display method from book class ");
														//	sample();
	}
		public void setVAlues(double pr , String auth , int numpage)
		{
			price = pr ;
			author = auth ;
			numofPages = numpage ;
		}
							//public void sample() 
								//{
									//	System.out.println(" This is the sample method of book ");
										//}
	}
