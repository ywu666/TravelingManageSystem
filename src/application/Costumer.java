package application;

import javafx.beans.property.SimpleStringProperty;


public class Costumer {
	private SimpleStringProperty name;
    private SimpleStringProperty credicCard;
    private SimpleStringProperty email;
    private SimpleStringProperty address;
    private SimpleStringProperty contact;
    
   
	public Costumer(String name, String credicCard, String email,String address, String contact) {
		this.setName(new SimpleStringProperty(name));
		this.setCredicCard(new SimpleStringProperty(credicCard));
		this.setEmail(new SimpleStringProperty(email));
		this.setContact(new SimpleStringProperty(contact));
		this.setAddress(new SimpleStringProperty(address));
		
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(SimpleStringProperty name) {
		this.name = name;
	}
	public String getCredicCard() {
		return credicCard.get();
	}
	public void setCredicCard(SimpleStringProperty credicCard) {
		this.credicCard = credicCard;
	}
	public String getEmail() {
		return email.get();
	}
	public void setEmail(SimpleStringProperty email) {
		this.email = email;
	}
	public String getAddress() {
		return address.get();
	}
	public void setAddress(SimpleStringProperty address) {
		this.address = address;
	}
	public String getContact() {
		return contact.get();
	}
	public void setContact(SimpleStringProperty contact) {
		this.contact = contact;
	}
	

    
    

}
