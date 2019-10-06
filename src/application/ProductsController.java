package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ProductsController {
	@FXML TableView<Product> table;
	@FXML TableColumn<Product, String> typeColumn;
	@FXML TableColumn<Product, String> priceColumn;
	
	private List<Product> products = new ArrayList<Product>();
	
	@FXML
	private void handleMain(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	
	}
		
	
	
	@FXML
	private void handleHotelDeal(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("addHotelDeal.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	}
	
	@FXML
	private void handleFlight(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("addFlight.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	

	public void initialiseList() {
		// mock data
	    products.add(new Product("Flight","$10000"));
	    products.add(new Product("Package Deal","$500"));
	    products.add(new Product("Hotel Deal","$10000"));
	    products.add(new Product("Product Special","$100"));
	    
		typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));


		table.getItems().addAll(FXCollections.observableList(products));
	}
	
	
	
	

}
