package com.bridgelabz.mood;


public class MoodAnalyser {
    String message;

    public static String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return null;
        }
    }
    public static String analyzeMood2(String message) {
        if (message.contains("i am in sad mood")) {
            return "SAD";
        } else if (message.contains("Happy")) {
            return "HAPPY";
        } else {
            return null;
        }
    }
}





