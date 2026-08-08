package com.parker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.parker.dto.ParkingLot;

@Service
public class OSMService {
    
    private final RestClient restClient;

    public OSMService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder.baseUrl("https://overpass-api.de").build();
    }
    public List<ParkingLot> findParkingLots(double lat, double lng) {
        List<ParkingLot> lots = new ArrayList<>();
        return lots;
    }
}
