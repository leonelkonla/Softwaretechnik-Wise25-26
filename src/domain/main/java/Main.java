import java.util.*;
import model.*;
import data.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main{
    public static void main(String[] args) {


        //User-Objekte werden für Pseudo-Datenbank erstellt
        User marty = new User("Marty", "Jabbusch");
        User leonel = new User("Leonel", "Konla");
        User leo = new User("Leo", "Ogger");
        User patrick = new User("Patrick", "Rahn");
        User rene = new User("Rene", "Pettelkau");

//User werden hinzugefügt
        DataBaseImit users = new DataBaseImit();
        users.add(marty);
        users.add(leonel);
        users.add(leo);
        users.add(patrick);
        users.add(rene);

//Die LoginView wird gelaunched
       Application.launch(view.LoginView.class, args);
        // Day
        /*Day.setCaloriesIntake(2100); Day.setExercisesCompleted(true);
      
        // User
        User user = new User(101, "Max", 28, 65.0, 1.70, "F", "secret",
                new Plan[]{ new Plan("Plan A") }, new Days[]{ new Days("Week 1") });
        System.out.println(user.getUsername() + " " + user.getAge());

        // MainController
        MainController ctrl = new MainController(user, new int[]{1,2});
        ctrl.setViews(new int[]{10}); System.out.println(ctrl.getViews().length);

        // MainMenu
        MainMenu menu = new MainMenu(1, new Stage(), new SubScene(), new SubScene());
        System.out.println(menu.getId());

        // ProfileView
        ProfileView pv = new ProfileView(10, new Stage(), user, new LineChart());
        System.out.println(pv.getUser().getUsername());
        */

    }
}
