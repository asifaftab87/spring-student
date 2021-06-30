package org.la.student.bakil.overloading_and_constructor;

public class AddressMain {

	public static void main(String[] args) {
		
		Address ad = new Address ();
		 ad.setStreet("Jalan Melati Utama 3");
		 ad.setDoor("J-8-7");
		 ad.setPostalcode("53100");
		 ad.setCity("Kuala Lumpur");
		 
		/* System.out.println("Door address :"+ad.getDoor());
		 System.out.println("Street address : "+ad.getStreet());
		 System.out.println("Postalcode :"+ad.getPostalcode());
		 System.out.println("City :"+ad.getCity());
		 */
		 
		 
		 User user = new User ();
		 user.setName("Bakil");
		 user.setId(977382);
		 user.setAddress(ad);
		 display (user);
	
	}
		 public static void  display (User user) {
			 String city = user.getAddress().getCity();
			 System.out.println("City :"+city);
		 }
	}


