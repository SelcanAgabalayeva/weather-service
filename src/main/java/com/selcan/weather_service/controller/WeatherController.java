package com.selcan.weather_service.controller;

import com.selcan.weather_service.dto.WeatherResponseDto;
import com.selcan.weather_service.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @Operation(
            summary = "Get weather by city",
            description = "Returns current weather, weekly forecast and hourly data for a given city"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Weather data returned successfully"),
            @ApiResponse(responseCode = "400", description = "City parameter is missing"),
            @ApiResponse(responseCode = "404", description = "City not found")
    })
    @GetMapping("/weather")
    public ResponseEntity<?> getWeather(

            @Parameter(
                    description = "City name",
                    required = false,
                    example = "Dhaka"
            )
            @RequestParam(required = false) String city
    ) {

        if (city == null || city.isBlank()) {
            return ResponseEntity.badRequest().body(
                    Map.of(
                            "success", false,
                            "message", "city parameter is required"
                    )
            );
        }

        WeatherResponseDto response = weatherService.getWeather(city);
        return ResponseEntity.ok(response);
    }
}