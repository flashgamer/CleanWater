package jonathan.model;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;

import com.google.android.gms.maps.model.LatLng;

import java.util.Date;

/**
 * Created by Jonathan on 12/5/2016.
 */

public class WaterSourceReport {

    private static int reports = 0;

    private Date date;
    private int reportNumber;
    private String user;
    private LatLng location;
    private WaterCondition condition;
    private WaterType type;

    public WaterSourceReport() {
        date = new Date(System.currentTimeMillis());
        reportNumber = reports++;
    }

    public WaterSourceReport(String user, LatLng location, WaterCondition condition, WaterType type) {
        date = new Date(System.currentTimeMillis());
        reportNumber = reports++;
        this.user = user;
        this.condition = condition;
        this.type= type;
        this.location = location;
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

    public LatLng getLocation() {
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

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public void setCondition(WaterCondition condition) {
        this.condition = condition;
    }

    public void setType(WaterType type) {
        this.type = type;
    }

}
