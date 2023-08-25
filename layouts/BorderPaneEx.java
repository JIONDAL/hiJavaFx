package layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneEx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] buttons = new Button[5];
		String[] buttonNames = {"TOP", "LEFT", "CENTER", "RIGHT", "BOTTOM"};
		
//		buttons[0] = new Button("TOP");
//		buttons[1] = new Button("LEFT");
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new Button(buttonNames[i]);
		}
		
		BorderPane border = new BorderPane();
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().add(buttons[0]);
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setStyle("-fx-background-color: #FFBB00;");
		flowTop.setPrefHeight(100);
		border.setTop(flowTop);
		
//		border.setTop(buttons[0]);
		
		border.setLeft(buttons[1]);
		border.setCenter(buttons[2]);
		border.setRight(buttons[3]);
		border.setBottom(buttons[4]);
		
		primaryStage.setScene(new Scene(border, 400, 300));
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}







