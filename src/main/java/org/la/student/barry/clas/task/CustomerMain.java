package org.la.student.barry.clas.task;

public class CustomerMain {

	public static void main(String[] args) {
		Customers customers= new Customers();
		customers.setCustomerId(1132);
		customers.setFirstName("Aissatiou");
		customers.setLastName("Barry");
		customers.setDoorNum("M-03-9");
		customers.setAddress1("Taman milaty");
		customers.setAddress2("Seri maya");
		customers.setCity("Kuala lumpur");
		customers.setState("Selangor");
		customers.setCountry("Malaysia");
		customers.setPostalCode(54200);
		customers.setPhone(182341654);
		customers.setEmail("aissaguin@gmail.com");
		customers.setVoiceMail("aissatou25@gmail.com");
		customers.setPassword(8876543);
		customers.setCreditCard("MasterCard  "+"5566-3455-2333-0943");
		customers.setCreditCardTypeId(235);
		customers.setCardExpMonth("03/June");
		customers.setCardExpYr(2024);
		customers.setBillingAddress("Seri maya level 4");
		customers.setBillingCity("Kuala lumpur");
		customers.setShipRegion("Selangor");
		customers.setShipPostalcode(54200);
		customers.setShipCountry("Malaysia");
		customers.setDateEntered(" Mondays 25th july 2021");
		
		int customerId= customers.getCustomerId();
		String firstName= customers.getFirstName();
		String lastName= customers.getLastName();
		String doorNum= customers.getDoorNum();
		String address1= customers.getAddress1();
		String address2= customers.getAddress2();
		String city= customers.getCity();
		String state= customers.getState();
		String country= customers.getCountry();
		int postalCode= customers.getPostalCode();
		int phone= customers.getPhone();
		String email= customers.getEmail();
		String voiceMail= customers.getVoiceMail();
		int password= customers.getPassword();
		String creditCard= customers.getCreditCard();
		int creditCardTypeId= customers.getCreditCardTypeId();
		String cardExpMonth= customers.getCardExpMonth();
		int cardExpYr= customers.getCardExpYr();
		String billingAddress= customers.getBillinAddress();
	    String billingCity= customers.getBillingCity();
	    String shipRegion= customers.getShipRegion();
	    int shipPostalcode=customers.getShipPostalcode();
	    String shipCountry= customers.getShipCountry();
	    String dateEntered= customers.getDateEntered();
	    
	    
	    System.out.println("CustomersId: "+customerId);
	    System.out.println("FirstName : "+firstName);
	    System.out.println("LastName: "+ lastName);
	    System.out.println("DoorNum : "+doorNum);
	    System.out.println("Address1: "+address1);
	    System.out.println("Address2: "+address2);
	    System.out.println("City: "+city);
	    System.out.println("State: "+state);
	    System.out.println("Country: "+country);
	    System.out.println("PostalCode: "+postalCode);
	    System.out.println("Phone: "+phone);
	    System.out.println("Email: "+email);
	    System.out.println("VoiceMale: "+voiceMail);
	    System.out.println("Password: "+password);
	    System.out.println("CreditCard: "+creditCard);
	    System.out.println("CreditCardTypeId: "+creditCardTypeId);
	    System.out.println("CardExpMonth: "+cardExpMonth);
	    System.out.println("CardExpYr: "+cardExpYr);
	    System.out.println("BillingAddress: "+billingAddress);
	    System.out.println("BillingCity: "+billingCity);
	    System.out.println("ShipRegion: "+shipRegion);
	    System.out.println("ShipPostalCode: "+shipPostalcode);
	    System.out.println("ShipCountry: "+shipCountry);
	    System.out.println("DateEntered: "+dateEntered);
		
	}

}
