package jonathan.model;

import java.util.Date;

/**
 * Created by Jonathan on 12/5/2016.
 */

public class WaterPurityReport {
    private Date date;
    private int reportNumber;
    private String user;
    private String location;
    private PurityCondition condition;
    private double virusPPM;
    private double contaminantPPM;

    public WaterPurityReport() {}

    public WaterPurityReport(String user, String location, PurityCondition condition, double virus, double contaminant) {
        date = new Date(System.currentTimeMillis());
        reportNumber = WaterSourceReport.reports++;
        this.user = user;
        this.location = location;
        this.condition = condition;
        virusPPM = virus;
        contaminantPPM = contaminant;
    }
}
