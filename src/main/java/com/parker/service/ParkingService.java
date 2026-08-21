package com.parker.service;

import java.util.List;

import org.springframework.stereotype.Service;

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
        int score = 0;
        String difficulty = "";
        OverPassResponse parkingLots= osmService.findParkingLots(lat, lng);
        return new ParkingResponse(difficulty, score);
    }
}
