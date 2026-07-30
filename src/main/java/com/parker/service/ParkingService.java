package com.parker.service;

import org.springframework.stereotype.Service;

import com.parker.dto.ParkingResponse;

@Service
public class ParkingService {
    
    public ParkingResponse getDifficulty(double lat, double lng) {
        int score = 0;
        String difficulty = "";
        if (lat > 10) {
            score += 50;
        }
        if (lng > 10) {
            score += 50;
        }
        if (score < 50) {
            difficulty = "Easy";
        } else if (score < 75) {
            difficulty = "Medium";
        } else {
            difficulty = "Hard";
        }
        return new ParkingResponse(difficulty, score);
    }
}
