package org.la.student.noor;
public class Fish {

      String name;
      String lifespan;
      String species;
      String color;

void display() {
	System.out.println("name: "+name);
	System.out.println("lifespan: "+lifespan);
	System.out.println("species: "+species);
	System.out.println("color: "+color);
}

void setValues( String n,String num, String s, String c) {
	
	name = n;
	lifespan=num;
	species = s;
	color = c;
}

public static void main(String[] args) {

	Fish fish = new Fish();
    fish.setValues("Goldie","1 yrs","Gold fish","Orange");
	fish.display();

	System.out.println("-----------------------");
	Fish fish1 = new Fish();
    fish1.setValues("Black drum","2 yrs","Hog fish","black");
	fish1.display();


}
}
