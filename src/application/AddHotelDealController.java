package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;



public class AddHotelDealController {
	@FXML Button submit;
	@FXML Button cancel;
	@FXML
	private void handleSubmit(){		
			loadProductsfxml();

	}
	
	@FXML
	private void handleCancle(){            
		loadProductsfxml();
		
	}
	
	
	private void loadProductsfxml(){
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
	
	
	

}
