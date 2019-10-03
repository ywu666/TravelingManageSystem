package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class CostumersController {
	
	//need to initialize the list 
	
	@FXML
	private void handleMain(){
		loadFxml("main.fxml");
	
	}
		
	
	
	@FXML
	private void handleAdd(){      
		loadFxml("addCostumer.fxml");
		
	}
	
	
	@FXML
	private void handleModify(){
		loadFxml("addCostumer.fxml");
		
		
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
