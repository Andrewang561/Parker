package com.parker.service;

import org.springframework.stereotype.Service;

import com.parker.dto.ParkingResponse;

@Service
public class ParkingService {
    
    public ParkingResponse getDifficulty() {
        return new ParkingResponse("Easy", 0);
    }
}
