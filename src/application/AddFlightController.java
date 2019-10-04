package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;


public class AddFlightController {
	@FXML Button submit;
	@FXML Button cancel;
	@FXML
	private void handleSubmit(){ //
		loadProductsfxml();
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
