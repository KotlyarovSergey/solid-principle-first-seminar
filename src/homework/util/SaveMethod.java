package homework.util;

import homework.Persistarable;
import homework.User;

public class SaveMethod implements Persistarable {

    @Override
    public void save(User user) {
        System.out.println("Any method to save user: " + user.getName());
    }
}
