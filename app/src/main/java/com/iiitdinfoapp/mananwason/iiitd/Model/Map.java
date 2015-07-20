package com.iiitdinfoapp.mananwason.iiitd.Model;

/**
 * Created by MananWason on 20-07-2015.
 */
public class Map {
    String title;
    String subtitle;
    String floor;
    String type;
    float latitude;
    float longitude;

    public Map(String title, String subtitle, String floor, String type, float latitude, float longitude){
        this.title = title;
        this.subtitle = subtitle;
        this.floor = floor;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
}
