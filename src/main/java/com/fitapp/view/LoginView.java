package com.fitapp.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginView extends Application {

    private Stage primaryStage; // store stage for testing

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    // Expose stage for tests
    public Stage getStage() {
        return primaryStage;
    }
}

//public class LoginView extends Application{
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        // Load the FXML file
//        Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
//
//        // Create the scene and set the stage
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.setTitle("Login");
//        primaryStage.show();
//    }
//}
