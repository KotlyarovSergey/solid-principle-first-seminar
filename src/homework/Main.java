package homework;

import homework.util.ConsoleReport;
import homework.util.SaveMethod;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        //user.report();
        Reportable reportable = new ConsoleReport();
        ReportManager reportManager = new ReportManager(reportable);
        reportManager.showReport(user);

        // user.save();
        Persistarable persistMethod = new SaveMethod();
        Persister persister = new Persister(persistMethod);
        persister.save(user);
    }
}