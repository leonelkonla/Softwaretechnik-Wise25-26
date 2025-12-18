package com.fitapp.controller;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MainMenuController {
    @FXML
    private Button caloriesButton;

    @FXML
    public void handleCheckCalories(ActionEvent event){
        changeView("caloricIntake.fxml");
    }

    protected void changeView(String fxmlFile) {
        try {
            // Load the new FXML file (next view)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlFile));
            Parent root = loader.load();

            // Get the current stage (window) and set the new scene
            Stage stage = (Stage) caloriesButton.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Menu");  // Optionally set the title of the new window
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();  // Handle the exception
        }
    }
    /*
    @FXML private void handleCheckCalories() {}
    @FXML private void handleAddExercise() {}
    @FXML private void handleMakePlan() {}
    @FXML private void handleViewStatistics() {}
    @FXML private void handleStepCounter() {}
     */

}
