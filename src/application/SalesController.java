package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class SalesController {   //need to initialize the table
	@FXML Button main;
	@FXML Button add;
	@FXML Button delete;
	@FXML TableView<Sale> table;
	@FXML TableColumn<Sale, String> CostumersColumn;
	@FXML TableColumn<Sale, String> ProductsColumn;
	@FXML TableColumn<Sale, String> EmployessColumn;
	@FXML TableColumn<Sale, String> DateColumn;


	private List<Sale> sales = new ArrayList<Sale>();

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
        Sale selection = table.getSelectionModel().getSelectedItem();
        
        if (selection.getProduct().equals("Flight")){
        	Alert alert = new Alert(AlertType.WARNING, "Delete the flight will need a cancellation fee.", ButtonType.OK);
    		alert.showAndWait();
    		
        }
        
		Alert alert = new Alert(AlertType.CONFIRMATION, "Delete " + "Sale" + " ?", ButtonType.YES, ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.YES) {
			table.getItems().remove(selection);
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





	public void initialiseList() {
		// mock data
		sales.add(new Sale("Mike","Hotel deal","Yujia","23.03.2019"));
		sales.add(new Sale("Mike","Flight","Yujia","26.03.2019"));
		sales.add(new Sale("Tom","Hotel deal","Yujia","26.03.2019"));
		sales.add(new Sale("Marry","Product package","Yujia","23.08.2019"));
		sales.add(new Sale("Jarry","Flight","Yujia","23.08.2019"));
		CostumersColumn.setCellValueFactory(new PropertyValueFactory<>("costumer"));
		ProductsColumn.setCellValueFactory(new PropertyValueFactory<>("product"));
		EmployessColumn.setCellValueFactory(new PropertyValueFactory<>("employee"));
		DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
		
		table.getItems().addAll(FXCollections.observableList(sales));
	}





}




