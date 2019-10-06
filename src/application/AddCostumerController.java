package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class AddCostumerController {
	@FXML Button submit;
	@FXML Button cancel;
	@FXML Text text;
	@FXML TextField tf1;
	@FXML TextField tf2;
	@FXML TextField tf3;
	@FXML TextField tf4;
	@FXML TextField tf5;
	
	@FXML
	private void handleSubmit(){  //warning if the name or the credit card number is blank	
			loadCostumerfxml();
	}
		 
	
	@FXML
	private void handleCancle(){            
		loadCostumerfxml();
		
	}
	
	
	private void loadCostumerfxml(){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("customers.fxml"));
			Parent root = loader.load();
			CostumersController controller = loader.getController();
			controller.initialiseList();
			Main.setStage(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		text.setText("Add a customer");
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
	}
	
	
	public void modify(String name, String card, String email,String contact,String address){
		text.setText("Modify a costumer.");
		tf1.setText(name);
		tf2.setText(card);
		tf3.setText(email);
		tf4.setText(contact);
		tf5.setText(address);
	}
	




}
