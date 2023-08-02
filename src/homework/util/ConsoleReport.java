package homework.util;

import homework.Reportable;
import homework.User;

public class ConsoleReport implements Reportable {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
