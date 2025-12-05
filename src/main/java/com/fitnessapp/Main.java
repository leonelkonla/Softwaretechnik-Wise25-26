import java.util.*;

public class src {
    public static void main(String[] args) {
        // Day
        day.setCaloriesIntake(2100); day.setExercisesCompleted(true);
      
        // User
        User user = new User(101, "Max", 28, 65.0, 1.70, "F", "secret",
                new Plan[]{ new Plan("Plan A") }, new Days[]{ new Days("Week 1") });
        System.out.println(user.getUsername() + " " + user.getAge());

        // domain.controller.MainController
        MainController ctrl = new MainController(user, new int[]{1,2});
        ctrl.setViews(new int[]{10}); System.out.println(ctrl.getViews().length);

        // domain.view.MainMenu
        MainMenu menu = new MainMenu(1, new Stage(), new SubScene(), new SubScene());
        System.out.println(menu.getId());

        // domain.view.ProfileView
        ProfileView pv = new ProfileView(10, new Stage(), user, new LineChart());
        System.out.println(pv.getUser().getUsername());
    }
}
