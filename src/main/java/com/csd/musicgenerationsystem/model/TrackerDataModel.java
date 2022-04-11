package com.csd.musicgenerationsystem.model;

import java.util.Date;
import java.util.List;

public class TrackerDataModel {
    private Date fullDate;

    private List<TrackerTimestampModel> data;

    public TrackerDataModel() {

    }

    public TrackerDataModel(Date fullDate, List<TrackerTimestampModel> data) {
        this.fullDate = fullDate;
        this.data = data;
    }

    public Date getFullDate() {
        return fullDate;
    }

    public void setFullDate(Date fullDate) {
        this.fullDate = fullDate;
    }

    public List<TrackerTimestampModel> getData() {
        return data;
    }

    public void setData(List<TrackerTimestampModel> data) {
        this.data = data;
    }
}
