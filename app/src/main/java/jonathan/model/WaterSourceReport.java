package jonathan.model;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;

import java.util.Date;

/**
 * Created by Jonathan on 12/5/2016.
 */

public class WaterSourceReport {

    private static int reports = 0;

    private Date date;
    private int reportNumber;
    private String user;
    private String location;
    private WaterCondition condition;
    private WaterType type;

    WaterSourceReport() {

    }

    WaterSourceReport(String user, String location, WaterCondition condition, WaterType type) {
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
}
