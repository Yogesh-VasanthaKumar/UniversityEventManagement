package com.universityProjectManagement.eventmanagement.model;

import java.util.Date;

public class Eventmodel {

private int eventid;
private String eventname;
private String location;
private Date date;
private Date starttime;
private Date endTime;

private String url;

    public Eventmodel(int eventid, String eventname, String location, Date date, Date starttime, Date endTime, String url) {
        this.eventid = eventid;
        this.eventname = eventname;
        this.location = location;
        this.date = date;
        this.starttime = starttime;
        this.endTime = endTime;
        this.url = url;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
