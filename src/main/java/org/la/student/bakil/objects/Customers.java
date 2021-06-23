package org.la.student.bakil.objects;
/*
 * Create a class Customers having member variables customerId, firstName, lastName, class, doorNum, address1, address2, 
 * city, state, postalcode, country, phone, email,  voiceMail, password, creditCard, creditCardTypeId, cardExpMonth, cardExpYr, 
 * billingAddress, billingCity, billingRegion, billingPostalcode, 
   billingCountry, shipAddress, shipCity, shipRegion, shipPostalcode, shipCountry, dateEntered. create getters and setters for all member variables. 
   Create object of Customers class in other class inside main method and set all member values and print all member values using getters.
 */
public class Customers {

	private int customerId;
	private String firstName,lastName,clas,doorNum,address1,address2,city,state,country;
	private String phone,email,password,creditCard,creditcardTypeId,cardExMonth,cardExpYear;
	private String billingAddress,billingCity,billingPostalCode,billingCountry,shipAddress,
	shipCity,shipRegion,shipPostalcode,shipCountry,dateEntered;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int ci) {
		customerId = ci;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	public String getClas() {
		return clas;
	}
	public void setClas(String cl) {
		clas = cl;
	}
	public String getDoorNum() {
		return doorNum;
	}
	public void setDoorNum(String dn) {
		doorNum = dn;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String ad1) {
		address1 = ad1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String ad2) {
		address2 = ad2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String cy) {
		city = cy;
	}
	public String getState() {
		return state;
	}
	public void setState(String st) {
		state = st;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String co) {
		country = co;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String ph) {
		phone = ph;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String em) {
		email = em;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String ps) {
		password = ps;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String cr) {
		creditCard = cr;
	}
	public String getCreditcardTypeId() {
		return creditcardTypeId;
	}
	public void setCreditcardTypeId(String crt) {
		creditcardTypeId = crt;
	}
	public String getCardExMonth() {
		return cardExMonth;
	}
	public void setCardExMonth(String edm) {
		cardExMonth = edm;
	}
	public String getCardExpYear() {
		return cardExpYear;
	}
	public void setCardExpYear(String cx) {
		cardExpYear = cx;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String ba) {
		billingAddress = ba;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String bc) {
		billingCity = bc;
	}
	public String getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(String bpc) {
		billingPostalCode = bpc;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String bco) {
		billingCountry = bco;
	}
	public String getShipAddress() {
		return shipAddress;
	}
	public void setShipAddress(String shp) {
		shipAddress = shp;
	}
	public String getShipCity() {
		return shipCity;
	}
	public void setShipCity(String shc) {
		shipCity = shc;
	}
	public String getShipRegion() {
		return shipRegion;
	}
	public void setShipRegion(String shr) {
		shipRegion = shr;
	}
	public String getShipPostalcode() {
		return shipPostalcode;
	}
	public void setShipPostalcode(String shp) {
		shipPostalcode = shp;
	}
	public String getShipCountry() {
		return shipCountry;
	}
	public void setShipCountry(String shbc) {
		shipCountry = shbc;
	}
	public String getDateEntered() {
		return dateEntered;
	}
	public void setDateEntered(String de) {
		dateEntered = de;
	}
	
	
	
}
