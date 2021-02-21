package org.la.student.aqsa;
import org.la.student.aqsa.Protected.Prtct;

	public class B1 extends Prtct {
public B1() {
	super.stand();
	
}
		 public static void main(String[] args) {
				B1 b  = new B1();
				b.stand();
				System.out.println(b.i);
				
			//	Prtct p = new Prtct(); parent class constructor cant be inherited to child why???//
			//	Prtct p = new Prtct();
				Prtct p1 = new B1();
				p1.stand();
				System.out.println(p1.i);
			   
		 }
		 
		 @Override
		 public void stand() {
				System.out.println(" Child method Stand");
				
			}

	}

