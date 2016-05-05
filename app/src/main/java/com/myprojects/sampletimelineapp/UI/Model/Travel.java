package com.myprojects.sampletimelineapp.UI.Model;

/**
 * Created by soniya on 05/05/16.
 */
public class Travel {

    private String title;
    private String travelType;
    private String travelDate;

    private String eventTitle;
    private String location;
    //private String eventDate;
    private String eventFromTime;
    private String eventToTime;

    public Travel() {
    }

    public Travel(String title, String travelType, String travelDate, String eventTitle, String location, String eventFromTime, String eventToTime) {
        this.title = title;
        this.travelType = travelType;
        this.travelDate = travelDate;
        this.eventTitle = eventTitle;
        this.location = location;
        this.eventFromTime = eventFromTime;
        this.eventToTime = eventToTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTravelType() {
        return travelType;
    }

    public void setTravelType(String travelType) {
        this.travelType = travelType;
    }

    public String getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(String travelDate) {
        this.travelDate = travelDate;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventFromTime() {
        return eventFromTime;
    }

    public void setEventFromTime(String eventFromTime) {
        this.eventFromTime = eventFromTime;
    }

    public String getEventToTime() {
        return eventToTime;
    }

    public void setEventToTime(String eventToTime) {
        this.eventToTime = eventToTime;
    }
}
