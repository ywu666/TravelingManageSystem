package application;

import javafx.beans.property.SimpleStringProperty;

public class Product {
	private SimpleStringProperty type;
    private SimpleStringProperty price;
    
	public Product(String type, String price) {
       this.setPrice(new SimpleStringProperty(price));
       this.setType(new SimpleStringProperty(type));
	}

	public String getType() {
		return type.get();
	}

	public void setType(SimpleStringProperty type) {
		this.type = type;
	}

	public String getPrice() {
		return price.get();
	}

	public void setPrice(SimpleStringProperty price) {
		this.price = price;
	}
	
	
	

}
