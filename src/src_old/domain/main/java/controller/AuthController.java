/*Controller für das Login UI
* Validiert Eingabedaten, indem die Datenbank-Suchfunktion aufgerufen wird
* Öffnet das MainMenu*/


package controller;

import data.DataBaseImit;
import javafx.stage.Stage;
import model.User;
import view.*;
import javafx.scene.Scene;

public class AuthController {


//Übergibt den eingegebenen Nutzernamen an DatabaseImit.findUser()
// Vergleicht eingegebenes Passwort mit dem des zurückgegebenen Users
    public boolean inputVal(String inputname, String inputpw){

        User user = DataBaseImit.instance.findUser(inputname);
        if( user != null){
            if(user.getPassword().equals(inputpw)){
                return true;
            }
        }
        return false;
    }

    //Erstellt neue Scene mit MainMenu-Nodes; Übergibt die Scene an die bestehende Stage
    public void navigateToMainMenu(Stage stage){
        MainMenu mainMenu = new MainMenu();
        Scene mainScene = new Scene(mainMenu.getRoot(), 800, 500);
        stage.setScene(mainScene);
        stage.setTitle("Hauptmenü");
    }
}
