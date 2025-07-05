package com.mycompany.aqianalysis;

import java.util.Arrays;
import java.util.Random;

public class AQIAnalysis {
    public static void main(String[] args) {
        // Generate 30 random AQI readings (1-300)
        Random random = new Random();
        int[] aqiReadings = new int[30];
        for (int i = 0; i < 30; i++) {
            aqiReadings[i] = random.nextInt(300) + 1; // 1 to 300
        }

        // Display readings
        System.out.println("AQI Readings: " + Arrays.toString(aqiReadings));

        // Compute median AQI
        Arrays.sort(aqiReadings); // Sort for median (PowerPoint: Lecture 1, Sorting)
        double median;
        if (aqiReadings.length % 2 == 0) {
            median = (aqiReadings[14] + aqiReadings[15]) / 2.0;
        } else {
            median = aqiReadings[14];
        }
        System.out.println("Median AQI: " + median);

        // Count hazardous days (AQI > 200)
        int hazardousDays = 0;
        for (int aqi : aqiReadings) {
            if (aqi > 200) {
                hazardousDays++;
            }
        }
        System.out.println("Number of Hazardous Days (AQI > 200): " + hazardousDays);
    }
}
