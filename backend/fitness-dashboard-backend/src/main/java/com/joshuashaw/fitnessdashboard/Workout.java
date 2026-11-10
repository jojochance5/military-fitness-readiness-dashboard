package com.joshuashaw.fitnessdashboard;

public class Workout {

    private String date;
    private int pushups;
    private int situps;
    private String runTime;

    public Workout() {
    }

    public Workout(String date, int pushups, int situps, String runTime) {
        this.date = date;
        this.pushups = pushups;
        this.situps = situps;
        this.runTime = runTime;
    }

    public String getDate() {
        return date;
    }

    public int getPushups() {
        return pushups;
    }

    public int getSitups() {
        return situps;
    }

    public String getRunTime() {
        return runTime;
    }
}