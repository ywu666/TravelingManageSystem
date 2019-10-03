package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;


public class SalesController {   //need to initialize the table
	@FXML Button main;
	@FXML Button add;
	@FXML Button delete;
	@FXML
	private void handleMain(){
		loadFxml("main.fxml");
	
	}
		
	
	
	@FXML
	private void handleAdd(){
		loadFxml("addSale.fxml");
		
	}
	
	
	@FXML
	private void handleDelete(){   
		//warning alert if the product is a flight
	
		Alert alert = new Alert(AlertType.CONFIRMATION, "Delete " + "Sale" + " ?", ButtonType.YES, ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.YES) {
		    //do stuff
		}
		
	}
	
	
	public void loadFxml(String fxml){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource(fxml));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
		
		
	 
		
		
		
		
		
	}
	
	


