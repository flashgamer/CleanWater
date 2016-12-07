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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PurityCondition getCondition() {
        return condition;
    }

    public void setCondition(PurityCondition condition) {
        this.condition = condition;
    }

    public double getVirusPPM() {
        return virusPPM;
    }

    public void setVirusPPM(double virusPPM) {
        this.virusPPM = virusPPM;
    }

    public double getContaminantPPM() {
        return contaminantPPM;
    }

    public void setContaminantPPM(double contaminantPPM) {
        this.contaminantPPM = contaminantPPM;
    }
}
