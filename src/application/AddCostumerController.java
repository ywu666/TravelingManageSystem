package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public class AddCostumerController {
	@FXML Button submit;
	@FXML Button cancel;
	
	@FXML
	private void handleSubmit(){
		Alert alert = new Alert(AlertType.CONFIRMATION, "Add a new sale ?", ButtonType.YES, ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.YES) {
			 //do stuff
			loadCostumerfxml();
		}
		   
			
         
		
	}
	
	@FXML
	private void handleCancel(){            
		loadCostumerfxml();
	}
	
	
	public void loadCostumerfxml(){
		
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("customers.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}



}
