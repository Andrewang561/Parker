package com.parker.dto;

public class ParkingResponse {

    private String difficulty;
    private int score;

    public ParkingResponse(double lat, double lng) {
        if (lat > 0 || lng > 0) {
            this.difficulty = "Hard";
            this.score = 100;
            return;
        }
        this.difficulty = "Easy";
        this.score = 0;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public int getScore() {
        return this.score;
    }
}