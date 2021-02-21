package org.la.student.aqsa.Protected;

public class Prtct {

		public int i;
	  
		protected Prtct(){
		this(5);
	   }
	   protected Prtct(int i) {
		   this.i=i;
		   System.out.println("parametarised "+i);   
	    } 
	   
	   public void stand() {
			// TODO Auto-generated method stub
			System.out.println(" Parent method Stand");
			
		}

	}

