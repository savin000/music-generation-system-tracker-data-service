package com.csd.musicgenerationsystem.model;

public class TrackerTimestampModel {
    private int hour;

    private int minutes;

    private int bpm;

    public TrackerTimestampModel() {

    }

    public TrackerTimestampModel(int hour, int minutes, int bpm) {

    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getBpm() {
        return bpm;
    }

    public void setBpm(int bpm) {
        this.bpm = bpm;
    }
}
