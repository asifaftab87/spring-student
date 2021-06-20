package org.la.student.barry.clas.task;

public class Customers {
	/*
	 * Create a class Customers having member variables customerId, firstName, lastName, 
	 * class, doorNum, address1, address2, city, state, postalcode, country, phone, email, voiceMail,
	 *  password, creditCard, creditCardTypeId, cardExpMonth, cardExpYr, billingAddress, billingCity, 
	 *  billingRegion, billingPostalcode, billingCountry, shipAddress, shipCity,
	 *   shipRegion, shipPostalcode, shipCountry, dateEntered. create getters and setters for 
	 *   all member variables. Create object of Customers class in other class inside main method 
	 *   and set all member values and print all member values using getters.
	 */
  
	private int customerId;
	private String firstName;
	private String lastName;
    private String doorNum;
    private String address1, address2;
    private String city,state,country;
    private int postalCode,phone;
    private String email,voiceMail;
    private int password,creditCardTypeId;
    private String creditCard;
    private String cardExpMonth;
    private int cardExpYr;
    private String billingAddress,billingCity,shipRegion;
    private int shipPostalcode;
    private String shipCountry,dateEntered;
    
    public int getCustomerId() {
    	return customerId;
    }
    public void setCustomerId(int i) {
    	customerId=i;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    public void setFirstName(String f) {
    	firstName=f;
    }
    
    public String getLastName() {
    	return lastName;
    }
    public void setLastName(String l) {
    	lastName=l;
    }
    
    public String getDoorNum() {
    	return doorNum;
    }
    public void setDoorNum(String d) {
    	doorNum=d;
    }
    
    public String getAddress1() {
    	return address1;
    }
    public void setAddress1(String ad1) {
    	address1=ad1;
    }
    public String getAddress2() {
    	return address2;
    }
    public void setAddress2(String ad2) {
    	address2=ad2;
    }
    public String getCity() {
    	return city;
    }
    public void setCity(String ci) {
       city=ci;
    }
    public String getState() {
    	return state;
    }
    public void setState(String st) {
    	state=st;
    }
    public String getCountry() {
    	return country;
    }
    public void setCountry(String co) {
    	country=co;
    }
    public int getPostalCode() {
    	return postalCode;
    }
    public void setPostalCode(int pc) {
    	postalCode=pc;
    }
    public int getPhone() {
    	return phone;
    }
    public void setPhone(int ph) {
    	phone=ph;
    }
    public String getEmail() {
    	return email;
    }
    public void setEmail(String em) {
    	email=em;
    }
    public String getVoiceMail() {
    	return voiceMail;
    }
    public void setVoiceMail(String vm) {
    	voiceMail=vm;
    }
    
    public int getPassword() {
    	return password;
    }
    public void setPassword(int pwd) {
    	password=pwd;
    }
    public String getCreditCard() {
    	return creditCard;
    }
    public void setCreditCard(String cc) {
    	creditCard=cc;
    }
    public int getCreditCardTypeId() {
    	return creditCardTypeId;
    }
    public void setCreditCardTypeId(int cct) {
    	creditCardTypeId=cct;
    }
    public String getCardExpMonth() {
    	return cardExpMonth;
    }
    public void setCardExpMonth(String cem) {
    	cardExpMonth=cem;
    }
    public int getCardExpYr() {
    	return cardExpYr;
    }
    public void setCardExpYr(int cey) {
    	cardExpYr=cey;
    }
    public String getBillinAddress() {
    	return billingAddress;
    }
    public void setBillingAddress(String ba) {
    	billingAddress=ba;
    }
    public String getBillingCity() {
    	return billingCity;
    }
    public void setBillingCity(String bc) {
    	billingCity=bc;
    }
    public String getShipRegion() {
    	return shipRegion;
    }
    public void setShipRegion(String sr) {
    	shipRegion=sr;
    }
    public int getShipPostalcode() {
    	return shipPostalcode;
    }
    public void setShipPostalcode(int sp) {
    	shipPostalcode=sp;
    }
    public String getShipCountry() {
    	return shipCountry;
    }
    public void setShipCountry(String sco) {
    	shipCountry=sco;
    }
    public String getDateEntered() {
    	return dateEntered;
    }
    public void setDateEntered(String de) {
    	dateEntered=de;
    }
}
