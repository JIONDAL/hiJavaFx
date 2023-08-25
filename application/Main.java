package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label label = new Label();
			label.setText("출력할 내용");
			
			label.setFont(new Font("Terminal", 30));
			
			Scene scene = new Scene(label,400,200);
			
			Toolkit tk = Toolkit.getDefaultToolkit();
			Dimension screenSize = tk.getScreenSize();
			
			System.out.println("width : " + screenSize.width);
			System.out.println("height : " + screenSize.height);
			
			int x = screenSize.width;
			int y = screenSize.height;
			
			primaryStage.setX(x / 2 - (400/2));
			primaryStage.setY(y / 2 - (200/2));
			primaryStage.setTitle("창의 제목");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
