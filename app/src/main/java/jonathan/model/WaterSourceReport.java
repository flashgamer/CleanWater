package jonathan.model;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;

import java.util.Date;

/**
 * Created by Jonathan on 12/5/2016.
 */

public class WaterSourceReport {

    public static int reports = 0;

    private Date date;
    private int reportNumber;
    private String user;
    private String location;
    private WaterCondition condition;
    private WaterType type;

    public WaterSourceReport() {

    }

    public WaterSourceReport(String user, String location, WaterCondition condition, WaterType type) {
        date = new Date(System.currentTimeMillis());
        reportNumber = reports++;
        this.user = user;
        this.condition = condition;
        this.type= type;
        this.location = location;
        // Geocoder geocoder = new Geocoder();
    }

    public static int getReports() {
        return reports;
    }

    public Date getDate() {
        return date;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public String getUser() {
        return user;
    }

    public String getLocation() {
        return location;
    }

    public WaterCondition getCondition() {
        return condition;
    }

    public WaterType getType() {
        return type;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCondition(WaterCondition condition) {
        this.condition = condition;
    }

    public void setType(WaterType type) {
        this.type = type;
    }
}
