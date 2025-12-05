package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainMenu {

    private BorderPane root;
    /*private int id;
    private Stage stage;
    private SubScene profilePanel;
    private SubScene trainingPanel;*/


    public MainMenu() {
        root = new BorderPane();
    }

    public BorderPane getRoot() {
        return root;
    }

    /*    // Getter und Setter
    public int getId() {
        return id;
    }

    public Stage getStage() {
        return stage;
    }

    public SubScene getProfilePanel() {
        return profilePanel;
    }

    public SubScene getTrainingPanel() {
        return trainingPanel;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setProfilePanel(SubScene profilePanel) {
        this.profilePanel = profilePanel;
    }

    public void setTrainingPanel(SubScene trainingPanel) {
        this.trainingPanel = trainingPanel;
    }

*/
}
