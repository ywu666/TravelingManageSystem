package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class CostumersController {
	@FXML TableView<Costumer> table;
	@FXML TableColumn<Costumer, String> nameColumn;
	@FXML TableColumn<Costumer, String> cardColumn;
	@FXML TableColumn<Costumer, String> emailColumn;
	@FXML TableColumn<Costumer, String> addressColumn;
	@FXML TableColumn<Costumer, String> contactColumn;


	private List<Costumer> costumers = new ArrayList<Costumer>();

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
		//loadFxml("addCostumer.fxml");
		Costumer s =table.getSelectionModel().getSelectedItem();
		if (s == null){
			Alert alert = new Alert(AlertType.WARNING, "Please select something.", ButtonType.OK);
			alert.showAndWait();

		}else{
			try {
				FXMLLoader loader = new FXMLLoader(getClass().getResource("addCostumer.fxml"));
				Parent root = loader.load();
				AddCostumerController controller = loader.getController();

				controller.modify(s.getName(), s.getCredicCard(), s.getEmail(), s.getContact(), s.getAddress());

				Main.setStage(root);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}



	}



	private void loadFxml(String fxml){

		try {
			Parent root = FXMLLoader.load(getClass().getResource(fxml));
			Main.setStage(root);

		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}


	public void initialiseList() {
		// mock data
		costumers.add(new Costumer("Mike","xxxxxxx","x@gmial.com","auckland","021xxxxxxx"));
		costumers.add(new Costumer("Jerry","xxxxxxx","xxxx@gmial.com","auckland","021xxxxxxx"));
		costumers.add(new Costumer("Mark","xxxxxxx","xxx@gmial.com","auckland","021xxxxxxx"));

		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		cardColumn.setCellValueFactory(new PropertyValueFactory<>("credicCard"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
		addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
		contactColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));

		table.getItems().addAll(FXCollections.observableList(costumers));
	}







}
