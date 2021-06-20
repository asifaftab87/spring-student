package org.la.student.jamal.clas;

/*10.	Create a class OrderItems having member variables orderId, productId, quantity.
 *  create getters and setters for all member variables. 
		Create object of OrderItems class in other class
		 inside main method and set all member values and print all member 
		 values using getters.
 * 
 */
public class OrderItems {
	
	private int orderId;
	private int productId;
	private int quantity;
	
	public void set(int oid,int pid,int q) {
		
		orderId=oid;
		productId=pid;
		quantity=q;
		
		
	
		
	}
	public int getOrderId() {
		return orderId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	
	public void display() {
		System.out.println("orderId: "+orderId+" productId:  "+productId+" quantity: "+quantity);
	}
	
	
	
	
	
	
	

}
