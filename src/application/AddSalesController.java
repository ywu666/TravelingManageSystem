package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;


public class AddSalesController {
	@FXML Button submit;
	@FXML Button cancel;
	@FXML
	private void handleSubmit(){
			loadSalesfxml();
	}
	
	@FXML
	private void handleCancel(){            
		loadSalesfxml();
	}
	
	
	public void loadSalesfxml(){
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


}
