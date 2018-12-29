package com.dodemath.app;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	
	private static Stage primaryStageObj;

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStageObj = primaryStage;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setScene(new Scene(root,438,515));
			
			primaryStage.setTitle("DoDeMath");
			primaryStage.getIcons().add(new Image("com/dodemath/img/logo.png"));
			primaryStage.show();
			

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Get the main stage
	 * 
	 * @return Stage
	 */
	public static Stage getStage(){
		return primaryStageObj;
	}
	

}
