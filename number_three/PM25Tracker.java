package com.mycompany.pm25tracker;

public class PM25Tracker {
    public static void trackWithWhile() {
        int day = 1;
        while (day <= 30) {
            double pm25 = Math.random() * 100; // Simulate PM2.5 reading (0-100)
            System.out.println("Day " + day + ": PM2.5 = " + pm25);
            day++;
        }
    }

    public static void trackWithFor() {
        for (int day = 1; day <= 30; day++) {
            double pm25 = Math.random() * 100; // Simulate PM2.5 reading (0-100)
            System.out.println("Day " + day + ": PM2.5 = " + pm25);
        }
    }

    public static void main(String[] args) {
        System.out.println("Using While Loop:");
        trackWithWhile();
        System.out.println("\nUsing For Loop:");
        trackWithFor();
    }
}
