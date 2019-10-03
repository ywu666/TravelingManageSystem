package application;

import java.util.List;

public class Sale {
	
	private String customer;
	private String product;
	private String Date;
	private String Employee;
	

	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getEmployee() {
		return Employee;
	}


	public void setEmployee(String employee) {
		Employee = employee;
	}


	public List<Sale> getSaleList(){
		return null;
		
	}

}
