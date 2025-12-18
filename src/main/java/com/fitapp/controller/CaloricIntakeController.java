package com.fitapp.controller;


import com.fitapp.model.CaloriesTracker;

import java.io.IOException;
import com.fitapp.model.NegativeCaloriesException;
import com.fitapp.model.CalorieLimitExceededException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class CaloricIntakeController {

    // instantiating CaloriesTracker object with recommended calories for an average adult
    private CaloriesTracker calTra = new CaloriesTracker(2000);

    @FXML
    private TextField caloriesField;

    @FXML
    private TextField remainingField;

    @FXML
    private Label caloriesOverflowLabel;

    @FXML
    public void handleAddingCalories(){
        try {
            int calories = Integer.parseInt(caloriesField.getText());
            calTra.addCalories(calories);
            // observer
            remainingField.textProperty().bind(calTra.remainingCaloriesProperty().asString());
            caloriesOverflowLabel.setVisible(false);
        } catch (NegativeCaloriesException e) {
            caloriesOverflowLabel.setText("Calories must be a positive number!");
            caloriesOverflowLabel.setVisible(true);

        } catch (CalorieLimitExceededException e) {
            caloriesOverflowLabel.setText("Exceeded daily calorie limit!");
            caloriesOverflowLabel.setVisible(true);

        } catch (NumberFormatException e) {
            caloriesOverflowLabel.setText("Please enter a valid number.");
            caloriesOverflowLabel.setVisible(true);
        }
    }

    @FXML
    public void handleReset(ActionEvent event){
        calTra.reset();
        // observer
        remainingField.textProperty().bind(calTra.getDailyLimit().asString());
        caloriesField.setText("");
        caloriesOverflowLabel.setVisible(false);
    }

    @FXML
    public void handleBackToMenu(ActionEvent event){
        changeView("mainMenu.fxml");
    }


    protected void changeView(String fxmlFile) {
        try {
            // Load the new FXML file (next view)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/" + fxmlFile));
            Parent root = loader.load();

            // Get the current stage (window) and set the new scene
            Stage stage = (Stage) caloriesField.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Menu");  // Optionally set the title of the new window
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();  // Handle the exception
        }
    }
}
