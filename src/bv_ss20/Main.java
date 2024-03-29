// BV Ue1 SS2020 Vorgabe
//
// Copyright (C) 2019-2020 by Klaus Jung
// All rights reserved.
// Date: 2020-04-08
package bv_ss20;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("FilterAppView.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Filter Application - WS2019/20 - Berresheim - Englisch ");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
