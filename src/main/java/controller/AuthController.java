package controller;

import javafx.stage.Stage;
import view.*;
import javafx.scene.Scene;

public class AuthController {

    private String username = "Max";
    private String password = "Team3";

    public boolean inputVal(String inputname, String inputpw){
        if(!inputname.equals(username) || !inputpw.equals(password)){
            return false;
        }
        return true;
    }

    public void navigateToMainMenu(Stage stage){
        MainMenu mainMenu = new MainMenu();
        Scene mainScene = new Scene(mainMenu.getRoot(), 800, 500);
        stage.setScene(mainScene);
        stage.setTitle("Hauptmenü");
    }
}
