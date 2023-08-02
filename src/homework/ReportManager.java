package homework;

public class ReportManager {
    private final Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void showReport(User user){
        this.reportable.report(user);
    }

}
