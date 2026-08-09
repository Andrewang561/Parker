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
    public String findParkingLots(double lat, double lng) {
        List<ParkingLot> lots = new ArrayList<>();

        String query = """
                [out:json];

                (
                    node["amenity"="parking"](around:100,%f,%f);
                    way["amenity"="parking"](around:100,%f,%f);
                    relation["amenity"="parking"](around:100,%f,%f);
                );

                out center;
                """.formatted(lat, lng, lat, lng, lat, lng);
        
        String res = restClient.post().uri("api/interpreter").body(query).retrieve().body(String.class);
        return res;
    }
}
