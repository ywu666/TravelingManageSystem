package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	static Stage STAGE;
	@Override
	public void start(Stage primaryStage) {
		try {
			STAGE = primaryStage;
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = loader.load();
			setStage(root);
			STAGE.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	 static void setStage(Parent root) {
	    	Scene scene = new Scene(root);
	    	STAGE.setScene(scene);
	    }
	 
	
	public static void main(String[] args) {
		launch(args);
	}
}
