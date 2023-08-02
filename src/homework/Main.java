package homework;

import homework.util.ConsoleReport;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        //user.report();
        Reportable reportable = new ConsoleReport();
        ReportManager reportManager = new ReportManager(reportable);
        reportManager.showReport(user);

        // user.save();
        Persister persister = new Persister(user);
        persister.save();
    }
}