package org.la.student.jamal.operators;

public class IfEles41 {
	
	//41. wap to print double if number is a double digit 
	
	public static void main(String[] args) {
		
		
        int x= -10;
		
		if ((x>9 && x<100)||(x<-9 && x>-100) ){
			System.out.println("double : " + x);
			
		}else {
			System.out.println("not double : "  + x);
		}
		
	}

}
