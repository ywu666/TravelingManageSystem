package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class ProductsController {
	
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

}
