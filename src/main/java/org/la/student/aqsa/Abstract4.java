package org.la.student.aqsa;

public abstract class Abstract4 {
	int a ,b;

	Abstract4(int a,int b){
		this.a=a;
		this.b=b;
	}
	Abstract4(){
		a=0;
		b=0;
	}
}
class AbstractC4 extends Abstract4{

	AbstractC4(){
		
		super(5,6);   // constructor chaining
	}
	AbstractC4(int a,int b){
		
		super();
	}
	
	
	public static void main(String[] args) {
		
		AbstractC4 obj = new AbstractC4();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		AbstractC4 obj1 = new AbstractC4(4,6);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
	}
	
}
