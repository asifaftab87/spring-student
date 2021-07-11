package org.la.student.abdullahi.methods.setters.getters;

public class MerchantsMain {

	public static void main(String[]args) {
		
		
		Merchants m = new Merchants();
		m.setId(001);
		m.setMerchantName("Jajere");
		m.setAdminId("ST1011");
		m.setCountryCode("+60");
		m.setCreatedAt("Qatar");
		
		int Id = m.getId();
		String MerchantName = m.getMerchantName();
		String AdminId = m.getAdminId();
		String CountryCode = m.getCountryCode();
		String CreatedAt = m.getCreatedAt();
		
		System.out.println("ID = "+Id);
		System.out.println("Merchant Name = "+ MerchantName);
		System.out.println("Admin Id = "+AdminId);
		System.out.println("Country Code = "+CountryCode);
		System.out.println("Created At = "+CreatedAt);
		
		
		
		
		
	}
}