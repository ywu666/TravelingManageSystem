package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;


public class MainController {
	
	@FXML Button sale;
	@FXML Button product;
	@FXML Button costumer;
	@FXML Button employess;
	
	@FXML
	private void handleCostumers() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("customers.fxml"));
			Parent root = loader.load();
			CostumersController controller = loader.getController();
			controller.initialiseList();
			Main.setStage(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	
	@FXML
	private void handleSales(){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("sales.fxml"));
			Parent root = loader.load();
			SalesController controller = loader.getController();
			controller.initialiseList();
			Main.setStage(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@FXML
	private void handleProducts(){
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("products.fxml"));
			Parent root = loader.load();
			ProductsController controller = loader.getController();
			controller.initialiseList();
			Main.setStage(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	@FXML
	private void handleEmployess(){
		//loadFxml("employess.fxml");
		//similar to costumers
	}
//	
//	private void loadFxml(String fxml){
//		
//		try {
//	        Parent root = FXMLLoader.load(getClass().getResource(fxml));
//			Main.setStage(root);
//			
//		} catch (IOException exception) {
//			exception.printStackTrace();
//		}
//	}


}
