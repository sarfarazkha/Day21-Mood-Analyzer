package com.bridgelabz.mood;


public class MoodAnalyser {
    String message;

    protected static String analyzeMood3(String i_am_in_any_mood) {
    }

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad")) {
                return "SAD";
            }
        } catch (NullPointerException e) {
            return "HAPPY";
        }
        return null;
    }
}
