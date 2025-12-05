/*
Klasse, die unsere noch nicht vorhandene
Datenbank imitieren soll.
 */

package data;
import model.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseImit {

    private List<User> users = new ArrayList<>();

    //Um in Main erstellte DataBase für AuthController verfügbar zu machen
    public static DataBaseImit instance;

    public DataBaseImit() {
    }

    public void add(User user){
        users.add(user);
        instance = this;
    }
    public User findUser(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
