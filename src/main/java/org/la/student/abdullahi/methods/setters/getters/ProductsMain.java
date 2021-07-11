package org.la.student.abdullahi.methods.setters.getters;

public class ProductsMain {


	public static void main(String[]args) {
		
		Products p = new Products();
		p.setId(001);
		p.setMerchantId("MI1011");
		p.setName("Ajasco");
		p.setPrice("$500");
		p.setStatus("Manager");
		p.setCreatedAt("United Kingdom");
		
		int Id = p.getId();
		String MerchantId = p.getMerchantId();
		String Name = p.getName();
		String Price = p.getPrice();
		String Status = p.getStatus();
		String CreatedAt = p.getCreatedAt();
		
		
		System.out.println("Id = " +Id);
		System.out.println("Merchant Id = " +MerchantId);
		System.out.println("Name = " +Name);
		System.out.println("Price = " +Price);
		System.out.println("Status = " +Status);
		System.out.println("CreatedAt = " +CreatedAt);
	}
}