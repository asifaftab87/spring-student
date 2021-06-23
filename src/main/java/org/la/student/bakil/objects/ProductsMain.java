package org.la.student.bakil.objects;

public class ProductsMain {

	public static void main(String[] args) {

		Products product =new Products();
		
		product.setId(32392);
		product.setMerchantId(77627);
		product.setName("SRU");
		product.setPrice("$$1200");
		product.setStatus("Deliverd");
		product.setCreatedAt("02/11/2018");
		
		
		int id =product.getId();
		int merchantId =product.getMerchantId();
		String name = product.getName();
		String price = product.getPrice();
		String status = product.getStatus();
		String createdAt = product.getCreatedAt();
		
		
		System.out.println("Id :"+id);
		System.out.println("Merchant id :"+merchantId);
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("Status :"+status);
		System.out.println("Created at :"+createdAt);
	}

}
