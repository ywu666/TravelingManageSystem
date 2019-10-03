package application;

import java.io.IOException;

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


public class SalesController {
	@FXML Button main;
	@FXML Button add;
	@FXML Button delete;
	@FXML TableView<Sale> listScales;
	@FXML TableColumn<Sale,String> CostumersColumn;
	@FXML TableColumn<Sale,String> ProductsColumn;
	@FXML TableColumn<Sale,String> DateColumn;
	@FXML TableColumn<Sale,String> EmployessColumn;
	
	private Sale sale;
	
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
		
		
	  public void initialiseTable(Sale sale){
			this.sale =sale;
			CostumersColumn.setCellValueFactory(new PropertyValueFactory<>("Customers"));
			ProductsColumn.setCellValueFactory(new PropertyValueFactory<>("Products"));
			DateColumn.setCellValueFactory(new PropertyValueFactory<>("Date"));
			EmployessColumn.setCellValueFactory(new PropertyValueFactory<>("Employee"));
			listScales.getItems().addAll(FXCollections.observableList(sale.getSaleList()));
		}
		
		
		
		
		
	}
	
	


