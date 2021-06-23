package org.la.student.bakil.objects;

public class MerchantsMain {

	public static void main(String[] args) {

		
		Merchants mr =new Merchants();
		
		mr.setId(232344);
		mr.setMerchantName("Firas");
		mr.setAdminId(558273);
		mr.setCountryCode("543220");
		mr.setCreatedAt("23/11/2009");
		
		
		int id = mr.getId();
		String merchantName =mr.getMerchantName();
		int adminId = mr.getAdminId();
		String countryCode = mr.getCountryCode();
		String createdAt = mr.getCreatedAt();
		
		System.out.println("Id :"+id);
		System.out.println("Merchant name :"+merchantName);
		System.out.println("Admin Id :"+adminId);
		System.out.println("Country code :"+countryCode);
		System.out.println("Created at :"+createdAt);

			
	}

}
