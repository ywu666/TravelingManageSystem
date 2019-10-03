package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class AddFlightController {
	@FXML Button submit;
	@FXML Button cancel;
	@FXML
	private void handleSubmit(){ //
		Alert alert = new Alert(AlertType.CONFIRMATION, "Add a new Flight ?", ButtonType.YES, ButtonType.NO);
		alert.showAndWait();

		
		if (alert.getResult() == ButtonType.YES) {
		  
			
			
			//after confirmation, warning if the data is not complete
			
			//if the data is complete, go back to 
			loadProductsfxml();
		}
		
		
		
	}
	
	@FXML
	private void handleCancle(){        
		loadProductsfxml();
		
	}
	
	
	private void loadProductsfxml(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("products.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

}
