package org.la.student.barry.clas.task;

public class ProductsMain {
	public static void main(String[] args) {
		
		Products products = new Products();
		products.setId(1111111);
		products.setName("Balde");
		products.setMerchantId(003430);
		products.setPrice(22589.99);
		products.setStatus("patients");
		
		int id= products.getId();
		String name= products.getName();
		int merchantId=products.getMerchantId();
		double price=products.getPrice();
		String status=products.getStatus();
		
		System.out.println("The Using Getters");
		
		System.out.println("Id: "+ id);
		System.out.println("Name: "+name);
	    System.out.println( "MerchantId: "+ merchantId);
	    System.out.println("Price: "+ price);
	    System.out.println("Status: "+status);
	}

}
