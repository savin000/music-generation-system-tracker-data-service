package com.csd.musicgenerationsystem.service;

import com.csd.musicgenerationsystem.model.TrackerDataModel;
import com.csd.musicgenerationsystem.model.TrackerTimestampModel;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class TrackerDataService {
    private static final int TRAINING_HOURS = 2;
    private static final int MINUTES_STEP = 5;
    private static final int MINUTES_BORDER = 60;

    private static final String DATE_PATTERN = "dd/MM/yyyy";

    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);

    public TrackerDataModel generateDataFromTheDevice() {
        List<TrackerTimestampModel> generatedTrackerData = new ArrayList<>();
        TrackerDataModel trackerDataModel = new TrackerDataModel();

        try {
            trackerDataModel.setFullDate(dateFormat.parse(dateFormat.format(new Date())));
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }

        Random random = new Random();
        int number = random.nextInt(21 - 8) + 8;

        for (int i = number; i < number + TRAINING_HOURS; i++) {
            for (int j = 0; j < MINUTES_BORDER; j += MINUTES_STEP) {
                TrackerTimestampModel trackerTimestampModel = new TrackerTimestampModel();
                trackerTimestampModel.setHour(i);
                trackerTimestampModel.setMinutes(j);
                trackerTimestampModel.setBpm(generateBpm());

                generatedTrackerData.add(trackerTimestampModel);
            }
        }

        trackerDataModel.setData(generatedTrackerData);
        return trackerDataModel;
    }

    private int generateBpm() {
        Random random = new Random();
        int number = random.nextInt(10 - 1) + 1;

        if (number > 8) {
            return random.nextInt(100 - 60) + 60; // fine bpm
        } else {
            return random.nextInt(160 - 129) + 129; // during training
        }
    }
}
