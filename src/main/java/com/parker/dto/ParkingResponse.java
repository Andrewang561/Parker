package com.parker.dto;

public class ParkingResponse {

    private String difficulty;
    private int score;

    public ParkingResponse(String difficulty, int score) {
        this.difficulty = difficulty;
        this.score = score;
    }

    public String getDifficulty() {
        return this.difficulty;
    }

    public int getScore() {
        return this.score;
    }
}