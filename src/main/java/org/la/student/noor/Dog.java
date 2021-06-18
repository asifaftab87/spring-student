package org.la.student.noor;

public class Dog {

	String name;
	int age;
	String breed;
	String color;

	void display() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("breed: "+breed);
		System.out.println("color: "+color);
	}

	void setValues( String a,int agenum, String b, String c) {
		
		name = a;
		age=agenum;
		breed = b;
		color = c;
	}

	public static void main(String[] args) {

		Dog dog = new Dog();
	    dog.setValues("Tom",3,"Bull dog","Brown");
		dog.display();

		System.out.println("-----------------------");
		 Dog dog2 = new Dog();
		 dog2.setValues("Max",5,"German Shepherd","Black");
	     dog2.display();

	}

}
