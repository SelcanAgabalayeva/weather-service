package com.selcan.weather_service.controller;

import com.selcan.weather_service.dto.WeatherResponseDto;
import com.selcan.weather_service.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping("/weather")
    public ResponseEntity<?> getWeather(
            @RequestParam(required = false)
            String city) {

        if (city == null || city.isBlank()) {

            return ResponseEntity.badRequest().body(
                    Map.of(
                            "success", false,
                            "message",
                            "city parameter is required"
                    )
            );
        }

        WeatherResponseDto response = weatherService.getWeather(city);
        return ResponseEntity.ok(response);
    }
}