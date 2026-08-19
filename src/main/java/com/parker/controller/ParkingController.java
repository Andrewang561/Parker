package com.parker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.parker.dto.OverPassResponse;
import com.parker.dto.ParkingResponse;
import com.parker.service.ParkingService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("api")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello From Parker! Sample Text";
    }

    @GetMapping("/parking")
    public OverPassResponse parking(
        @RequestParam double lat,
        @RequestParam double lng
    ) {
        return parkingService.getParkingData(lat, lng);
    }
}