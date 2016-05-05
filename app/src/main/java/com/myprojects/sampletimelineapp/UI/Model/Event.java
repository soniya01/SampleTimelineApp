package com.myprojects.sampletimelineapp.UI.Model;

/**
 * Created by soniya on 05/05/16.
 */
public class Event {

    private String eventTitle;
    private String location;
    private String eventDate;
    private String eventFromTime;
    private String eventToTime;

    public Event() {
    }

    public Event(String title, String location, String eventDate, String eventFromTime, String eventToTime) {
        this.eventTitle = title;
        this.location = location;
        this.eventDate = eventDate;
        this.eventFromTime = eventFromTime;
        this.eventToTime = eventToTime;
    }

    public String getTitle() {
        return eventTitle;
    }

    public void setTitle(String title) {
        this.eventTitle = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
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
