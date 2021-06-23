package org.la.student.bakil.objects;

public class CustomersMAin {

	public static void main(String[] args) {
		
		Customers cu = new Customers ();
		cu.setCustomerId(23882);
		cu.setFirstName("Bakil");
		cu.setLastName("Alkhaledi");
		cu.setDoorNum("C-4-12");
		cu.setAddress1("KL, Taman Melati");
		cu.setAddress2("Jalan Melati 4");
		cu.setCity("Kula Lumpur");
		cu.setState("Kuala lumpur");
		cu.setCountry("Malaysia");
		cu.setPhone("01137737549");
		cu.setEmail("allembey-2012@hotmail.com");
		cu.setPassword("******");
		cu.setCreditCard("Visa card");
		cu.setCreditcardTypeId("Debit card");
		cu.setCardExMonth("December");
		cu.setCardExpYear("2023");
		cu.setBillingAddress("Kuala lumpur,Taman Melati");
		cu.setBillingCity("Kuala Lumpur");
		cu.setBillingPostalCode("53100");
		cu.setBillingCountry("Malaysia");
		cu.setShipAddress("Jalan Ampang , KL");
		cu.setShipCity("Kuala lumpur");
		cu.setShipRegion("Selangor");
		cu.setShipPostalcode("54200");
		cu.setShipCountry("Malaysia");
		cu.setDateEntered("01/05/2020");
		
		System.out.println("Customer id :"+cu.getCustomerId());
		System.out.println("First name :"+cu.getFirstName());
		System.out.println("Last name :"+cu.getLastName());
		System.out.println("Class :"+cu.getClas());
		System.out.println("Door number :"+cu.getDoorNum());
		System.out.println("Address1 :"+cu.getAddress1());
		System.out.println("Address2 :"+cu.getAddress2());
		System.out.println("City :"+cu.getCity());
		System.out.println("State :"+cu.getState());
		System.out.println("Country :"+cu.getCountry());
		System.out.println("Phone number :"+cu.getPhone());
		System.out.println("Email :"+cu.getEmail());
		System.out.println("Password :"+cu.getPassword());
		System.out.println("Credit card :"+cu.getCreditCard());
		System.out.println("Credit card type :"+cu.getCreditcardTypeId());
		System.out.println("Card expaier month"+cu.getCardExMonth());
		System.out.println("Card expaier year :"+cu.getCardExpYear());
		System.out.println("Billing address :"+cu.getBillingAddress());
		System.out.println("Billing city :"+cu.getBillingCity());
		System.out.println("Postal cose :"+cu.getBillingPostalCode());
		System.out.println("Billing country :"+cu.getBillingCountry());
		System.out.println("Ship address :"+cu.getShipAddress());
		System.out.println("Ship city :"+cu.getShipCity());
		System.out.println("Ship region :"+cu.getShipRegion());
		System.out.println("Ship postal code :"+cu.getShipPostalcode());
		System.out.println("Ship country :"+cu.getShipCountry());
		System.out.println("Date enterd :"+cu.getDateEntered());
		
	}
}
