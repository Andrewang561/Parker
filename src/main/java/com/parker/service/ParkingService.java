package com.parker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parker.dto.OverPassElement;
import com.parker.dto.OverPassResponse;
import com.parker.dto.ParkingLot;
import com.parker.dto.ParkingResponse;

@Service
public class ParkingService {
    
    private final OSMService osmService;

    public ParkingService(OSMService osmSerivce) {
        this.osmService = osmSerivce;
    }

    public ParkingResponse getDifficulty(double lat, double lng) {
        int score = 100;
        String difficulty = "HARD";
        OverPassResponse parkingLotResponse = osmService.findParkingLots(lat, lng);
        List<OverPassElement> parkingLots = parkingLotResponse.getElements();
        for (int i = 0; i < parkingLots.size(); i++) {
            score -= 10;
        }
        if (score > 30 && score < 70) {
            difficulty = "MEDIUM";
        } else if (score < 20) {
            difficulty = "EASY";
            if (score < 0) {
                score = 0;
            }
        }
        return new ParkingResponse(difficulty, score);
    }
}
