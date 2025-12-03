package controller;

import data.DataBaseImit;
import javafx.stage.Stage;
import model.User;
import view.*;
import javafx.scene.Scene;

public class AuthController {



    public boolean inputVal(String inputname, String inputpw){

        User user = DataBaseImit.instance.findUser(inputname);
        if( user != null){
            if(user.getPassword().equals(inputpw)){
                return true;
            }
        }
        return false;
    }

    public void navigateToMainMenu(Stage stage){
        MainMenu mainMenu = new MainMenu();
        Scene mainScene = new Scene(mainMenu.getRoot(), 800, 500);
        stage.setScene(mainScene);
        stage.setTitle("Hauptmenü");
    }
}
