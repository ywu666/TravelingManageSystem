package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class CostumersController {
	
	
	
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
	private void handleAdd(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("addCostumer.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	}
	
	
	@FXML
	private void handleModify(){
		try {
	        Parent root = FXMLLoader.load(getClass().getResource("addCostumer.fxml"));
			Main.setStage(root);
			
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		
	}
	
	
	
	
	

}
