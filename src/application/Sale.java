package application;

import javafx.beans.property.SimpleStringProperty;

public class Sale {
	private SimpleStringProperty product;
	private SimpleStringProperty costumer;
	private SimpleStringProperty date;
	private SimpleStringProperty employee;
	
	
	public Sale(String costumer, String product, String employee, String date) {
		this.setProduct(new SimpleStringProperty(product));
		this.setCustomer(new SimpleStringProperty(costumer));
		this.setEmployee(new SimpleStringProperty(employee));
		this.setDate(new SimpleStringProperty(date));
	}
	public String getProduct() {
		return product.get();
	}
	public void setProduct(SimpleStringProperty product) {
		this.product = product;
	}
	public String getCostumer() {
		return costumer.get();
	}
	public void setCustomer(SimpleStringProperty customer) {
		this.costumer = customer;
	}
	public String getDate() {
		return date.get();
	}
	public void setDate(SimpleStringProperty date) {
		this.date = date;
	}
	public String getEmployee() {
		return employee.get();
	}
	public void setEmployee(SimpleStringProperty employee) {
		this.employee = employee;
	}
	
	
	

}
