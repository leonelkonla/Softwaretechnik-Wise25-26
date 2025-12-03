package data;
import model.*;
import java.util.ArrayList;
import java.util.List;

public class DataBaseImit {

    private List<User> users = new ArrayList<>();
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
