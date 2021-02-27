package org.la.student.nawaz.Inhrtnce;

public class Animal1 {
	
	public void eat() {
		    System.out.println("The Animal like to eat Grass");
		  }
		}

	
		class Dog extends Animal1 {

		  
		  @Override
		  public void eat() {

		   
		    super.eat();
		    System.out.println("The Dog like to eat food");
		  }

		  
		  public void bark() {
		    System.out.println("The Dog bark");
		  }
		}

		


