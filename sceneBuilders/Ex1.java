package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(getClass());
		System.out.println(getClass().getResource("ex1.fxml"));
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));
		Parent form = loader.load();
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("ex1");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}








